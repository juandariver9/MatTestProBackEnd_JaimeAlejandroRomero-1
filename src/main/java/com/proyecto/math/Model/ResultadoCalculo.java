package com.proyecto.math.Model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "resultados_calculos")
public class ResultadoCalculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "ensayo_id", nullable = false)
    private EnsayoTraccion ensayo;

    @Column(name = "esfuerzo")
    private Double esfuerzo;

    @Column(name = "deformacion")
    private Double deformacion;

    @Column(name = "modulo_calculado")
    private Double moduloCalculado;

    @Column(name = "factor_seguridad")
    private Double factorSeguridad;

    @Column(name = "usado_limite_elastico")
    private Boolean usadoLimiteElastico;

    @Column(name = "creado_en")
    private LocalDateTime creadoEn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EnsayoTraccion getEnsayo() {
        return ensayo;
    }

    public void setEnsayo(EnsayoTraccion ensayo) {
        this.ensayo = ensayo;
    }

    public Double getEsfuerzo() {
        return esfuerzo;
    }

    public void setEsfuerzo(Double esfuerzo) {
        this.esfuerzo = esfuerzo;
    }

    public Double getDeformacion() {
        return deformacion;
    }

    public void setDeformacion(Double deformacion) {
        this.deformacion = deformacion;
    }

    public Double getModuloCalculado() {
        return moduloCalculado;
    }

    public void setModuloCalculado(Double moduloCalculado) {
        this.moduloCalculado = moduloCalculado;
    }

    public Double getFactorSeguridad() {
        return factorSeguridad;
    }

    public void setFactorSeguridad(Double factorSeguridad) {
        this.factorSeguridad = factorSeguridad;
    }

    public Boolean getUsadoLimiteElastico() {
        return usadoLimiteElastico;
    }

    public void setUsadoLimiteElastico(Boolean usadoLimiteElastico) {
        this.usadoLimiteElastico = usadoLimiteElastico;
    }

    public LocalDateTime getCreadoEn() {
        return creadoEn;
    }

    public void setCreadoEn(LocalDateTime creadoEn) {
        this.creadoEn = creadoEn;
    }

}