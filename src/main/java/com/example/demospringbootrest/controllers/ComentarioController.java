package com.example.demospringbootrest.controllers;

import com.example.demospringbootrest.models.Comentario;
import com.example.demospringbootrest.services.ComentarioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("comentarios")
public class ComentarioController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PersonaController.class);

    @Autowired private ComentarioService comentarioService;

    @GetMapping
    public List<Comentario> findAll(){
        return comentarioService.findAll();
    }

    @PostMapping
    public ResponseEntity<Comentario> insert(@Valid @RequestBody Comentario requestComentario){
        LOGGER.info("insertando comentario {}", requestComentario);
        requestComentario.setEstado(0);
        requestComentario.setFecha(LocalDateTime.now());
        Comentario saveComentario = comentarioService.save(requestComentario);
        return ResponseEntity.status(HttpStatus.CREATED).body(saveComentario);
    }

    @PostMapping(value = "{id}")
    public Comentario save(@PathVariable("id") Long id, @Valid @RequestBody Comentario requestComentario){
        requestComentario.setId(id);
        LOGGER.info("guardar {}", requestComentario);
        return comentarioService.save(requestComentario);
    }

    @DeleteMapping(value = "{id}")
    public void deleteById(@PathVariable("id") Long id){
        comentarioService.deleteById(id);
    }
}