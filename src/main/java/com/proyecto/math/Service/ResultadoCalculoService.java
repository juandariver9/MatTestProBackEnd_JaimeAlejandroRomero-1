package com.proyecto.math.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.math.Model.ResultadoCalculo;
import com.proyecto.math.Repository.ResultadoCalculoRepository;

@Service
public class ResultadoCalculoService {

    @Autowired
    private ResultadoCalculoRepository resultadoCalculoRepository;

    public List<ResultadoCalculo> obtenerTodos() {
        return resultadoCalculoRepository.findAll();
    }

    public Optional<ResultadoCalculo> obtenerPorId(Long id) {
        return resultadoCalculoRepository.findById(id);
    }

    public ResultadoCalculo guardar(ResultadoCalculo resultado) {
        return resultadoCalculoRepository.save(resultado);
    }

    public void eliminar(Long id) {
        resultadoCalculoRepository.deleteById(id);
    }
}
