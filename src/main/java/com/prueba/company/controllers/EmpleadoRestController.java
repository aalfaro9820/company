package com.prueba.company.controllers;

import com.prueba.company.entity.Empleado;
import com.prueba.company.service.IEmpleadoService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class EmpleadoRestController {

    @Autowired
    private IEmpleadoService empleadoService;

    @GetMapping("/empleados")
    public List<Empleado> index() {
        return empleadoService.findAll();
    }

    @GetMapping("/empleado/{id}")
    public ResponseEntity<?> show(@PathVariable Integer id) {
        Empleado empleado = null;
        Map<String, Object> response = new HashMap<>();
        try {
            empleado = empleadoService.findById(id);
        } catch (Exception e) {
            response.put("mensaje", "Error al realizar realizar consulta en la base de datos");
            response.put("error", e.getMessage());

            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        if (empleado == null) {
            response.put("mensaje", "El empleado con ID: " + id.toString() + " no existe en la base de datos!");
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(empleado, HttpStatus.OK);

    }

    /**
     *
     * @param empleado
     * @return
     */
    @PostMapping("/empleado")
    public ResponseEntity<?> create(@RequestBody Empleado empleado) {
        Empleado empleadoNew = null;
        Map<String, Object> response = new HashMap<>();
        try {
            empleadoNew = empleadoService.save(empleado);
        } catch (DataAccessException e) {
            response.put("mensaje", "Error al realizar operacion de crear empleado en la base de datos");
            response.put("error", e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        response.put("mensaje", "El empleado se ha creado correctamente");
        response.put("empleado", empleadoNew);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PutMapping("/empleado/{id}")
    public ResponseEntity<?> update(@RequestBody Empleado empleado, @PathVariable Integer id) {
        Map<String, Object> response = new HashMap<>();
        Empleado empleadoActual = empleadoService.findById(id);
        Empleado empleadoUpdate = null;
        if (empleadoActual == null) {
            response.put("mensaje", "Error no se pudo actualizar el empleado con ID: " + id.toString()
                    + " no existe en la base de datos!");
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
        try {
            empleadoActual.setNombre(empleado.getNombre());
            empleadoActual.setFechaIngreso(empleado.getFechaIngreso());
            empleadoActual.setDni(empleado.getDni());
            empleadoActual.setCargo(empleado.getCargo());
            empleadoUpdate = empleadoService.save(empleadoActual);
            response.put("mensaje", "El empleado se ha actualizado correctamente");
            response.put("empleado", empleadoUpdate);
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        } catch (DataAccessException e) {
            response.put("mensaje", "Error al realizar operacion de actualizar empleado en la base de datos");
            response.put("error", e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/empleado/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id) {
        Map<String, Object> response = new HashMap<>();
        try {
            empleadoService.delete(id);
        } catch (DataAccessException e) {
            response.put("mensaje", "Error al realizar operacion de eliminar empleado en la base de datos");
            response.put("error", e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        response.put("mensaje", "El empleado se ha eliminado correctamente");
        return new ResponseEntity<>(response, HttpStatus.OK);

    }

}
