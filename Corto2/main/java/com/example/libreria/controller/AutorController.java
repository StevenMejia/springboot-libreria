package com.example.libreria.controller;

import com.example.libreria.model.Autor;
import com.example.libreria.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/autores")
public class AutorController {
    @Autowired
    private AutorRepository autorRepo;

    @GetMapping
    public List<Autor> getAll() {
        return autorRepo.findAll();
    }

    @PostMapping
    public Autor create(@RequestBody Autor autor) {
        return autorRepo.save(autor);
    }
}