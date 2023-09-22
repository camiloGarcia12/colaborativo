<<<<<<< HEAD
package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.MiembroEquipoRepository;

@RestController
@RequestMapping("/MiembroEquipo")
public class MiembroEquipoController {
    private final MiembroEquipoRepository miembroEquipoRepository;

    @Autowired
    public MiembroEquipoController(MiembroEquipoRepository miembroEquipoRepository) {
        this.miembroEquipoRepository = miembroEquipoRepository;
    }

    // Agregar métodos para crear, actualizar, obtener y eliminar miembros del equipo
=======
package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.MiembroEquipoRepository;

@RestController
@RequestMapping("/MiembroEquipo")
public class MiembroEquipoController {
    private final MiembroEquipoRepository miembroEquipoRepository;

    @Autowired
    public MiembroEquipoController(MiembroEquipoRepository miembroEquipoRepository) {
        this.miembroEquipoRepository = miembroEquipoRepository;
    }

    // Agregar métodos para crear, actualizar, obtener y eliminar miembros del equipo
>>>>>>> bf3215978af7449e7f897db95ed7178fab113fae
}