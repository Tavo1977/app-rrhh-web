/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.frsf.ofa.cursojava.rrhh.web.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.*;


/**
 *
 * @author gmuller
 */
@Entity
public class Proyecto{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private Integer id;
    private String nombre;
    private String descripcion;
    private double presupuestoMaximo;
    @ManyToOne
    @JoinColumn(name =  "ID_CLIENTE")
    private Cliente cliente;
    @ManyToMany
    @JoinTable(name="Proyecto_empleado",joinColumns = @JoinColumn(name = "ID_PROYECTO"),inverseJoinColumns = @JoinColumn(name= "ID_EMPLEADO"))
    private List<Empleado> empleados;

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
    

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public String ToString(){
        String texto = "El Proyecto nro " + id + " llamado " + nombre + " consiste en " + descripcion + " y cuenta con con un tope de " + presupuestoMaximo + " pesos" ;
        return texto;  
    }
        
    public boolean equals(Proyecto ProaC) {
        if (this == ProaC) return true;
        if (ProaC == null) return false;
        if (getClass() != ProaC.getClass()) return false;        
        if (!this.nombre.equals(ProaC.nombre)) return false;
        if (!this.descripcion.equals(ProaC.descripcion)) return false;
        if (this.presupuestoMaximo != ProaC.presupuestoMaximo) return false;
        return true;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPresupuestoMaximo() {
        return presupuestoMaximo;
    }

    public void setPresupuestoMaximo(double presupuestoMaximo) {
        this.presupuestoMaximo = presupuestoMaximo;
    }
       
}
