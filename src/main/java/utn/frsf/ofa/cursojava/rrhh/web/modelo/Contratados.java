/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.frsf.ofa.cursojava.rrhh.web.modelo;
import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author gustavo
 */
@Entity 
@DiscriminatorValue(value = "2") 
public class Contratados extends Empleado{
    private double MonPorHor;

    public double getMonPorHor() {
        return MonPorHor;
    }

    public void setMonPorHor(double MonPorHor) {
        this.MonPorHor = MonPorHor;
    }

   
    @Override
    public Double salario() {
       return horasTrabajadas * MonPorHor;
    }
    
    @Override
    public Boolean esEfectivo(){
        return false;
    }
      
    @Override
    public Boolean esContratado(){
        return true;
    }
    
}
