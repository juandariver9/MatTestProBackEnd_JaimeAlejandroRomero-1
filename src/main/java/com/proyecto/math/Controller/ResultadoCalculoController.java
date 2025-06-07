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

import com.proyecto.math.Model.ResultadoCalculo;
import com.proyecto.math.Service.ResultadoCalculoService;

@RestController
@RequestMapping("/api/resultados")
public class ResultadoCalculoController {

    @Autowired
    private ResultadoCalculoService resultadoCalculoService;

    @GetMapping
    public List<ResultadoCalculo> obtenerTodos() {
        return resultadoCalculoService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Optional<ResultadoCalculo> obtenerPorId(@PathVariable Long id) {
        return resultadoCalculoService.obtenerPorId(id);
    }

    @PostMapping
    public ResultadoCalculo crear(@RequestBody ResultadoCalculo resultado) {
        return resultadoCalculoService.guardar(resultado);
    }

    @PutMapping("/{id}")
    public ResultadoCalculo actualizar(@PathVariable Long id, @RequestBody ResultadoCalculo resultado) {
        resultado.setId(id);
        return resultadoCalculoService.guardar(resultado);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        resultadoCalculoService.eliminar(id);
    }
}
