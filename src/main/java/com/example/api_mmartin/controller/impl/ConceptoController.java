package com.example.api_mmartin.controller.impl;

import com.example.api_mmartin.model.dto.Concepto;
import org.springframework.web.bind.annotation.*;

public interface ConceptoController {

    @PostMapping("/crear")
    String crearConcepto(Concepto concepto);


    @PutMapping("actualizar")
    String actualizarConcepto(Concepto conceptoActual);

    @DeleteMapping("/eliminar")
    String eliminarConcepto(@RequestBody Concepto conceptoAEliminar);

    @GetMapping("/mostrarconceptos")
    String mostrarConcepto();

}
