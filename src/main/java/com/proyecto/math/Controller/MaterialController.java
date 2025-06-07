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

import com.proyecto.math.Model.Material;
import com.proyecto.math.Service.MaterialService;

@RestController
@RequestMapping("/api/materiales")
public class MaterialController {

    @Autowired
    private MaterialService materialService;

    @GetMapping
    public List<Material> obtenerTodos() {
        return materialService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Optional<Material> obtenerPorId(@PathVariable Long id) {
        return materialService.obtenerPorId(id);
    }

    @PostMapping
    public Material crear(@RequestBody Material material) {
        return materialService.guardar(material);
    }

    @PutMapping("/{id}")
    public Material actualizar(@PathVariable Long id, @RequestBody Material material) {
        material.setId(id);
        return materialService.guardar(material);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        materialService.eliminar(id);
    }
}
