package com.example.Lab1.service;

import com.example.Lab1.model.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorService {

    public List<Author> getAll();

    public Optional<Author> save(Author author);

}
