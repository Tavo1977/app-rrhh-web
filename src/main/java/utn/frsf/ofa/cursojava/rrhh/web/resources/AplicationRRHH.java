/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.frsf.ofa.cursojava.rrhh.web.resources;

import java.util.HashSet;
import javax.ws.rs.*;
import javax.ws.rs.core.Application;
import java.util.Set;

/**
 *
 * @author gmuller
 */
@ApplicationPath("/api")
public class AplicationRRHH extends Application{
    @Override
    public Set<Class<?>> getClasses(){
        final Set<Class<?>> classes = new HashSet<>();        
        classes.add(ClienteResource.class);
        return classes;
    }
    
    }
