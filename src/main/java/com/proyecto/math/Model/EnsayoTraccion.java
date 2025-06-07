package com.proyecto.math.Model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ensayos_traccion")
public class EnsayoTraccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "material_id", nullable = false)
    private Material material;

    @Column(name = "fuerza_aplicada")
    private Double fuerzaAplicada;

    @Column(name = "area_inicial")
    private Double areaInicial;

    @Column(name = "longitud_inicial")
    private Double longitudInicial;

    @Column(name = "longitud_final")
    private Double longitudFinal;

    @Lob
    private String notas;

    @Column(name = "foto_url")
    private String fotoUrl;

    @Column(name = "fecha_ensayo")
    private LocalDate fechaEnsayo;

    @Column(name = "creado_en")
    private LocalDateTime creadoEn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Double getFuerzaAplicada() {
        return fuerzaAplicada;
    }

    public void setFuerzaAplicada(Double fuerzaAplicada) {
        this.fuerzaAplicada = fuerzaAplicada;
    }

    public Double getAreaInicial() {
        return areaInicial;
    }

    public void setAreaInicial(Double areaInicial) {
        this.areaInicial = areaInicial;
    }

    public Double getLongitudInicial() {
        return longitudInicial;
    }

    public void setLongitudInicial(Double longitudInicial) {
        this.longitudInicial = longitudInicial;
    }

    public Double getLongitudFinal() {
        return longitudFinal;
    }

    public void setLongitudFinal(Double longitudFinal) {
        this.longitudFinal = longitudFinal;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public String getFotoUrl() {
        return fotoUrl;
    }

    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
    }

    public LocalDate getFechaEnsayo() {
        return fechaEnsayo;
    }

    public void setFechaEnsayo(LocalDate fechaEnsayo) {
        this.fechaEnsayo = fechaEnsayo;
    }

    public LocalDateTime getCreadoEn() {
        return creadoEn;
    }

    public void setCreadoEn(LocalDateTime creadoEn) {
        this.creadoEn = creadoEn;
    }

}