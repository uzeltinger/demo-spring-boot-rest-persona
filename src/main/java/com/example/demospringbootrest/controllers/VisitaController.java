package com.example.demospringbootrest.controllers;

import com.example.demospringbootrest.models.Comentario;
import com.example.demospringbootrest.models.Visita;
import com.example.demospringbootrest.services.ComentarioService;
import com.example.demospringbootrest.services.VisitaService;
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
@RequestMapping("visita")
public class VisitaController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PersonaController.class);

    @Autowired
    private VisitaService visitaService;

    @GetMapping
    public List<Visita> findAll(){
        return visitaService.findAll();
    }

    @PostMapping
    public Visita insert(@Valid @RequestBody Visita requestVisita){
        LOGGER.info("insertando visita {}", requestVisita);
        return requestVisita;
    }
}
