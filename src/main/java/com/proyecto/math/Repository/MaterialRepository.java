package com.proyecto.math.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.math.Model.Material;


public interface MaterialRepository extends JpaRepository<Material, Long> {
}

