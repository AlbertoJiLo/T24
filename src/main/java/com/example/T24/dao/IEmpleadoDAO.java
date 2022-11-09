package com.example.T24.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.T24.dto.Empleado;


public interface IEmpleadoDAO extends JpaRepository<Empleado, Long>{
	
	//Listar empleados por su trabajo
	public List<Empleado> findByTrabajo(String trabajo);
	
}
