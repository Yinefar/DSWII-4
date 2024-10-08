package com.example.sesion04domingo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.sesion04domingo.entity.Libro;
import com.example.sesion04domingo.service.LibroService;

@RestController
@RequestMapping("/url/libro")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping("/libroPorStatusAndTitle")
    public List<Libro> libroPorStatusAndTitle(@RequestParam String status, @RequestParam String title) {
        return libroService.libroPorStatusAndTitle(status, title);
    }
}