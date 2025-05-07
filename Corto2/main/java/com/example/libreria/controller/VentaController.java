package com.example.libreria.controller;

import com.example.libreria.model.Venta;
import com.example.libreria.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ventas")
public class VentaController {
    @Autowired
    private VentaRepository ventaRepo;

    @GetMapping
    public List<Venta> getAll() {
        return ventaRepo.findAll();
    }

    @PostMapping
    public Venta create(@RequestBody Venta venta) {
        return ventaRepo.save(venta);
    }
}