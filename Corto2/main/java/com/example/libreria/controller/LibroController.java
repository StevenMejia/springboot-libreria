package com.example.libreria.controller;

import com.example.libreria.model.Libro;
import com.example.libreria.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/libros")
public class LibroController {
    @Autowired
    private LibroRepository libroRepo;

    @GetMapping
    public List<Libro> getAll() {
        return libroRepo.findAll();
    }

    @PostMapping
    public Libro create(@RequestBody Libro libro) {
        return libroRepo.save(libro);
    }
}