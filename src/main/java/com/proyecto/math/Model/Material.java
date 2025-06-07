package com.proyecto.math.Model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "materiales")
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(length = 50)
    private String tipo;

    @Column(name = "modulo_elasticidad")
    private Double moduloElasticidad;

    @Column(name = "resistencia_ult")
    private Double resistenciaUlt;

    @Column(name = "limite_elastico")
    private Double limiteElastico;

    @Column(name = "elongacion_max")
    private Double elongacionMax;

    @Column(name = "densidad")
    private Double densidad;

    @Column(name = "creado_en")
    private LocalDateTime creadoEn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getModuloElasticidad() {
        return moduloElasticidad;
    }

    public void setModuloElasticidad(Double moduloElasticidad) {
        this.moduloElasticidad = moduloElasticidad;
    }

    public Double getResistenciaUlt() {
        return resistenciaUlt;
    }

    public void setResistenciaUlt(Double resistenciaUlt) {
        this.resistenciaUlt = resistenciaUlt;
    }

    public Double getLimiteElastico() {
        return limiteElastico;
    }

    public void setLimiteElastico(Double limiteElastico) {
        this.limiteElastico = limiteElastico;
    }

    public Double getElongacionMax() {
        return elongacionMax;
    }

    public void setElongacionMax(Double elongacionMax) {
        this.elongacionMax = elongacionMax;
    }

    public Double getDensidad() {
        return densidad;
    }

    public void setDensidad(Double densidad) {
        this.densidad = densidad;
    }

    public LocalDateTime getCreadoEn() {
        return creadoEn;
    }

    public void setCreadoEn(LocalDateTime creadoEn) {
        this.creadoEn = creadoEn;
    }

}
