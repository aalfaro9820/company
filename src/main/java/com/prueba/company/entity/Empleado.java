/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.company.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author alalfaro
 */
@Entity
@Table(name = "GT_EMPLEADOS")
public class Empleado implements Serializable {

    @Id
    private BigInteger dni;
    private String nombre;
    private String cargo;
    private Date fechaIngreso;

    public Empleado() {
    }
    
    public Empleado(BigInteger dni) {
        this.dni = dni;
    }
    

    public BigInteger getDni() {
        return dni;
    }

    public void setDni(BigInteger dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss", timezone = "America/Bogota")
    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

}
