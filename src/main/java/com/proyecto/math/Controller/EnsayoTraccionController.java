package com.proyecto.math.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.math.Model.EnsayoTraccion;
import com.proyecto.math.Service.EnsayoTraccionService;

@RestController
@RequestMapping("/api/ensayos")
public class EnsayoTraccionController {

    @Autowired
    private EnsayoTraccionService ensayoTraccionService;

    @GetMapping
    public List<EnsayoTraccion> obtenerTodos() {
        return ensayoTraccionService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Optional<EnsayoTraccion> obtenerPorId(@PathVariable Long id) {
        return ensayoTraccionService.obtenerPorId(id);
    }

    @PostMapping
    public EnsayoTraccion crear(@RequestBody EnsayoTraccion ensayo) {
        return ensayoTraccionService.guardar(ensayo);
    }

    @PutMapping("/{id}")
    public EnsayoTraccion actualizar(@PathVariable Long id, @RequestBody EnsayoTraccion ensayo) {
        ensayo.setId(id);
        return ensayoTraccionService.guardar(ensayo);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        ensayoTraccionService.eliminar(id);
    }
}
