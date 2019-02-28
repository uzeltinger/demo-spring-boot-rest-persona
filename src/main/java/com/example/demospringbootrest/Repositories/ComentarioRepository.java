package com.example.demospringbootrest.Repositories;

import com.example.demospringbootrest.models.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComentarioRepository extends JpaRepository<Comentario, Long> {

}
