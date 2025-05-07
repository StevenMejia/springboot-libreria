package com.example.libreria.repository;

import com.example.libreria.model.DetalleVenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetalleVentaRepository extends JpaRepository<DetalleVenta, Long> {}