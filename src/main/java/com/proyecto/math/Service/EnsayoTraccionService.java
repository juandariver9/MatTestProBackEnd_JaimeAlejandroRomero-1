package com.proyecto.math.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.math.Model.EnsayoTraccion;
import com.proyecto.math.Model.Material;
import com.proyecto.math.Model.ResultadoCalculo;
import com.proyecto.math.Repository.EnsayoTraccionRepository;
import com.proyecto.math.Repository.MaterialRepository;
import com.proyecto.math.Repository.ResultadoCalculoRepository;

@Service
public class EnsayoTraccionService {

    @Autowired
    private EnsayoTraccionRepository ensayoTraccionRepository;

    @Autowired
    private ResultadoCalculoRepository resultadoCalculoRepository;

    @Autowired
    private MaterialRepository materialRepository;

    public List<EnsayoTraccion> obtenerTodos() {
        return ensayoTraccionRepository.findAll();
    }

    public Optional<EnsayoTraccion> obtenerPorId(Long id) {
        return ensayoTraccionRepository.findById(id);
    }

    public EnsayoTraccion guardar(EnsayoTraccion ensayo) {
        
        EnsayoTraccion ensayoGuardado = ensayoTraccionRepository.save(ensayo);

        
        Optional<Material> optionalMaterial = materialRepository.findById(ensayo.getMaterial().getId());

        if (optionalMaterial.isPresent()) {
            Material material = optionalMaterial.get();

            
            double esfuerzo = ensayo.getFuerzaAplicada() / ensayo.getAreaInicial(); // σ = F / A
            double deformacion = (ensayo.getLongitudFinal() - ensayo.getLongitudInicial()) / ensayo.getLongitudInicial(); // ε = ΔL / L₀
            double modulo = esfuerzo / deformacion; // E = σ / ε

            boolean usarLimiteElastico = material.getLimiteElastico() != null && material.getLimiteElastico() > 0;
            double resistencia = usarLimiteElastico ? material.getLimiteElastico() : material.getResistenciaUlt();
            double factorSeguridad = resistencia / esfuerzo;


            
            ResultadoCalculo resultado = new ResultadoCalculo();
            resultado.setEnsayo(ensayoGuardado);
            resultado.setEsfuerzo(esfuerzo);
            resultado.setDeformacion(deformacion);
            resultado.setModuloCalculado(modulo);
            resultado.setFactorSeguridad(factorSeguridad);
            resultado.setUsadoLimiteElastico(usarLimiteElastico);

            
            resultadoCalculoRepository.save(resultado);
        }

        return ensayoGuardado;
    }

    public void eliminar(Long id) {
        ensayoTraccionRepository.deleteById(id);
    }
}
