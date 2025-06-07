package com.proyecto.math.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.math.Model.Material;
import com.proyecto.math.Repository.MaterialRepository;

@Service
public class MaterialService {

    @Autowired
    private MaterialRepository materialRepository;

    public List<Material> obtenerTodos() {
        return materialRepository.findAll();
    }

    public Optional<Material> obtenerPorId(Long id) {
        return materialRepository.findById(id);
    }

    public Material guardar(Material material) {
        return materialRepository.save(material);
    }

    public void eliminar(Long id) {
        materialRepository.deleteById(id);
    }
}
