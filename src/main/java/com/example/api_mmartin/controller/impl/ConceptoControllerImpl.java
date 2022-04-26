package com.example.api_mmartin.controller.impl;

import com.example.api_mmartin.model.dto.Concepto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Concepto")

public class ConceptoControllerImpl implements ConceptoController{


    @Override
    @PostMapping("/crear")
    public String crearConcepto(@RequestBody Concepto concepto) {
        return null;
    }

    @Override
    @PutMapping("/actualizar")
    public String actualizarConcepto(@RequestBody Concepto conceptoActual) {
        return null;
    }

    @Override
    @DeleteMapping("/eliminar")
    public String eliminarConcepto(@RequestBody Concepto conceptoAEliminar) {
        return null;
    }
    @GetMapping("/conceptos")
    @Override
    public String mostrarConcepto() {
        return "Mi lista de conceptos";
    }
}


