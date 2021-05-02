package com.leticia.cursomc.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.leticia.cursomc.domain.Categoria;


@Repository
public interface
CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
