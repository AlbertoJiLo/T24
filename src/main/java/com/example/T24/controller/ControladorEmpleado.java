package com.example.T24.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.T24.dto.Empleado;
import com.example.T24.service.EmpleadoServiceImpl;

@RestController
@RequestMapping("/api")
public class ControladorEmpleado {
	
	@Autowired
	EmpleadoServiceImpl empleadoServiceImpl;
	
	@GetMapping("/empleados")
	public List<Empleado> listarEmpleados(){
		return empleadoServiceImpl.listarEmpleados();
	}
	
	//listar Empleados por campo trabajo
	@GetMapping("/empleados/trabajo/{trabajo}")
	public List<Empleado> listarEmpleadosNombre(@PathVariable(name="trabajo") String trabajo) {
	    return empleadoServiceImpl.listarEmpleadoTrabajo(trabajo);
	}
	
	
	@PostMapping("/empleados")
	public Empleado crearEmpleado(@RequestBody Empleado empleado) {
		
		
		//Tendremos en cuenta que al introducir el trabajo se pondrá automáticamente el salario.
		
		empleado.setSalario(empleado.getTrabajo());
		
		return empleadoServiceImpl.crearEmpleado(empleado);
		
	}
	
	
	@GetMapping("/empleados/{id}")
	public Empleado leerEmpleado(@PathVariable(name="id") Long id) {
		
		Empleado empleado= new Empleado();
		
		empleado=empleadoServiceImpl.leerEmpleado(id);
		
		System.out.println("Empleado segun ID: "+empleado);
		
		return empleado;
	}
	
	@PutMapping("/empleados/{id}")
	public Empleado actualizarEmpleado(@PathVariable(name="id")Long id,@RequestBody Empleado empleado) {
		
		Empleado empleado_seleccionado= new Empleado();
		Empleado empleado_actualizado= new Empleado();
		
		empleado_seleccionado= empleadoServiceImpl.leerEmpleado(id);

		empleado_seleccionado.setNombre(empleado.getNombre());
		empleado_seleccionado.setTrabajo(empleado.getTrabajo());
		empleado_seleccionado.setSalario(empleado.getTrabajo());

		
		empleado_actualizado = empleadoServiceImpl.actualizarEmpleado(empleado_seleccionado);
		
		System.out.println("El empleado actualizado es: "+ empleado_actualizado);
		
		return empleado_actualizado;
	}
	
	@DeleteMapping("/empleados/{id}")
	public void borrarEmpleado(@PathVariable(name="id")Long id) {
		empleadoServiceImpl.borrarEmpleado(id);
	}
	
	
}
