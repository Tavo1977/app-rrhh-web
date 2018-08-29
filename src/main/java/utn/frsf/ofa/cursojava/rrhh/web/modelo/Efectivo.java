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
@DiscriminatorValue(value = "1") 
public class Efectivo extends Empleado{    
    private double SueldoBasico;
    private double Comisiones;
    private Integer CanMInHorObl;

    public double getSueldoBasico() {
        return SueldoBasico;
    }

    public void setSueldoBasico(double SueldoBasico) {
        this.SueldoBasico = SueldoBasico;
    }

    public double getComisiones() {
        return Comisiones;
    }

    public void setComisiones(double Comisiones) {
        this.Comisiones = Comisiones;
    }

    public Integer getCanMInHorObl() {
        return CanMInHorObl;
    }

    public void setCanMInHorObl(Integer CanMInHorObl) {
        this.CanMInHorObl = CanMInHorObl;
    }
    
    @Override
    public Double salario() {
        double extra = 0;
        if(horasTrabajadas > CanMInHorObl){
            extra = (horasTrabajadas - CanMInHorObl) * (SueldoBasico/20);
        }
        return SueldoBasico + Comisiones + extra;
    }
    
    @Override
    public Boolean esEfectivo(){
        return true;
    }
      
    @Override
    public Boolean esContratado(){
        return false;
    }
}
