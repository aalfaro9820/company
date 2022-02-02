package com.prueba.company.service;

import java.util.List;

/**/import com.prueba.company.entity.Empleado;

public interface IEmpleadoService {

	public List<Empleado> findAll();

	public Empleado findById(Integer id);

	public Empleado save(Empleado empleado);

	public void delete(Integer id);

}
