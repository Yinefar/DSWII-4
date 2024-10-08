package com.example.sesion04domingo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sesion04domingo.entity.Libro;
import com.example.sesion04domingo.repository.LibroRepository;

@Service
public class LibroServiceImpl implements LibroService {

    @Autowired
    private LibroRepository libroRepository;

    @Override
    public List<Libro> libroPorStatusAndTitle(String status, String title) {
        return libroRepository.libroPorStatusAndTitle(status, title);
    }

}