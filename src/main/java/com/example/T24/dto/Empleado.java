package com.example.T24.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empleado")

public class Empleado {

	//Atributos de la entidad Empleado
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String trabajo;
	private int salario;
	
	
	//Constructores
	
	public Empleado() {
		
	}
	
	public Empleado(Long id, String nombre, String trabajo, int salario) {
		this.id=id;
		this.nombre=nombre;
		this.trabajo=trabajo;
		this.salario=salario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}

	public int getSalario() {
		return salario;
	}

	//En este setter le asigno un salario dependiendo del trabajo.
	
	public void setSalario(String trabajo) {
		
		String trabajoMinus=trabajo.toLowerCase();
		switch(trabajoMinus) {
		case "programador":
			this.salario = 1000;
			break;
		case "profesor":
			this.salario = 1500;
			break;
		case "tutor":
			this.salario = 1200;
			break;
		}
	}

	//To string personalizado
	@Override
	public String toString() {
		return "Empleado [id = " + id +", nombre = " + nombre +", trabajo = "
				+ trabajo +", salario = " + salario + " ] ";
	}
}
