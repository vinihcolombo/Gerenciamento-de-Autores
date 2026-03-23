package com.example.Produto.repositories;

import com.example.Produto.models.AutorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<AutorModel, Long> {
}