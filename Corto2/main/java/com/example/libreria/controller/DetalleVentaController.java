package com.example.libreria.controller;

import com.example.libreria.model.DetalleVenta;
import com.example.libreria.repository.DetalleVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/detalles")
public class DetalleVentaController {
    @Autowired
    private DetalleVentaRepository detalleRepo;

    @GetMapping
    public List<DetalleVenta> getAll() {
        return detalleRepo.findAll();
    }

    @PostMapping
    public DetalleVenta create(@RequestBody DetalleVenta detalle) {
        return detalleRepo.save(detalle);
    }
}