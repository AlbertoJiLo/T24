package com.example.T24.service;

import java.util.List;

import com.example.T24.dto.Empleado;

public interface IEmpleadoService {

	//Metodos del CRUD
	
	public List<Empleado> listarEmpleados(); //Listar All 
	
	public Empleado crearEmpleado(Empleado empleado);	//CREATE
	
	public Empleado leerEmpleado(Long id); // READ
	
	public List<Empleado> listarEmpleadoTrabajo(String trabajo);//Listar empleados por campo trabajo
	
	public Empleado actualizarEmpleado(Empleado empleado); // UPDATE
	
	public void borrarEmpleado(Long id);// DELETE
	
	
}
