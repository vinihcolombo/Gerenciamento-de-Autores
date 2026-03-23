package com.example.autor.services;

import com.example.autor.models.AutorModel;
import com.example.autor.repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {

    @Autowired
    private AutorRepository repository;

    public AutorModel salvar(AutorModel autor) {
        return repository.save(autor);
    }

    public List<AutorModel> listar() {
        return repository.findAll();
    }

    public AutorModel buscar(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}