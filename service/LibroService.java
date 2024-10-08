package com.example.sesion04domingo.service;
import java.util.List;

import com.example.sesion04domingo.entity.Libro;

public interface LibroService {

        public List<Libro> libroPorStatusAndTitle(String status, String title);
}