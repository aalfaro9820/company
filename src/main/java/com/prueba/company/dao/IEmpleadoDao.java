package com.prueba.company.dao;

import com.prueba.company.entity.Empleado;
import org.springframework.data.repository.CrudRepository;


public interface IEmpleadoDao extends CrudRepository< Empleado, Integer> {
	
	

}
