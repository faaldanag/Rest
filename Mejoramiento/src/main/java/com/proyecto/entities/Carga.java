package com.proyecto.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "carga")

public class Carga  implements Serializable {


    private static final long serialVersionUID = 22L;
    private long id;
    private String descripcion;
   
   

    public Carga() {
    }

    public Carga(int id, String codigo, String descripcion, String cargo, boolean estado) {
	this.id = id;
	this.descripcion = descripcion;
    }

    @Id 
    @GeneratedValue( strategy = GenerationType.IDENTITY ) 
    @Column( name = "id", nullable = false ) 
    public long getId() {
	return id;
    }

    public void setId(long id) {
	this.id = id;
    }

    @Column(name = "DESCRIPCION")
    public String getDescripcion() {
	return descripcion;
    }

    public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
    }

    @Override
    public String toString() {
	return "CARGA{" + "id=" + id + ", descripcion=" + descripcion+ "}";
    }
    
}
