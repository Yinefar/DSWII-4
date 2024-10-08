package com.example.sesion04domingo.repository;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.sesion04domingo.entity.Libro;

public interface LibroRepository extends MongoRepository<Libro, ObjectId> {

    @Query("{ $and:  [{'status' : ?0, 'title' : /?1/ } ] }")
    public List<Libro> libroPorStatusAndTitle(String status, String title);
    

}