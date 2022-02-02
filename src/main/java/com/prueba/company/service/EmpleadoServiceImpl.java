package com.prueba.company.service;

import com.prueba.company.entity.Empleado;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

    @Autowired
    private IEmpleadoService empleadoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Empleado> findAll() {
        return (List<Empleado>) empleadoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Empleado findById(Integer id) {
        return empleadoDao.findById(id);
    }

    @Override
    @Transactional
    public Empleado save(Empleado cargo) {
        return empleadoDao.save(cargo);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        empleadoDao.delete(id);
    }

}
