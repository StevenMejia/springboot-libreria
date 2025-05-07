package com.example.libreria.controller;

import com.example.libreria.model.Cliente;
import com.example.libreria.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepo;

    @GetMapping
    public List<Cliente> getAll() {
        return clienteRepo.findAll();
    }

    @PostMapping
    public Cliente create(@RequestBody Cliente cliente) {
        return clienteRepo.save(cliente);
    }
}