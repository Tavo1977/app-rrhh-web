/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.frsf.ofa.cursojava.rrhh.web.resources;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;
import utn.frsf.ofa.cursojava.rrhh.web.modelo.Cliente;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 *
 * @author gmuller
 */
@Stateless
@Path("/cliente")
public class ClienteResource{
    @GET
    public Response listarCLientes(){
        return Response.ok("GET").build();
    }
    
    @POST
    public Response crearCliente(Cliente cli){
       System.out.println("CLiente Recibido: " + cli);
        return Response.ok("POST " + cli.getNombre()).build();
    }
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
