package com.example.autor.controllers;

import com.example.autor.models.AutorModel;
import com.example.autor.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autores")
public class AutorController {

    @Autowired
    private AutorService service;

    @PostMapping
    public AutorModel salvar(@RequestBody AutorModel autor) {
        return service.salvar(autor);
    }

    @GetMapping
    public List<AutorModel> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public AutorModel buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}