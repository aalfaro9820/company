/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.company.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author alalfaro
 */
@Entity
@Table(name = "GT_EMPLEADOS")
public class Empleado implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final String SEQ = "seq_gt_empleados";

    @Id
    @Column(name = "id_empleado")
    @GeneratedValue(generator = Empleado.SEQ)
    @SequenceGenerator(sequenceName = Empleado.SEQ, name = Empleado.SEQ, allocationSize = 1)
    private Integer id;

    private BigInteger dni;
    private String nombre;
    private String cargo;
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "fecha_ingreso")
    private Date fechaIngreso;

    public Empleado() {
    }

    public Empleado(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

}
