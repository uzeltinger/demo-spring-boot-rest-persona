package com.example.demospringbootrest.controllers;

import com.example.demospringbootrest.Repositories.PersonaRepository;
import com.example.demospringbootrest.models.Persona;
import com.example.demospringbootrest.services.PersonaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("personas")
public class PersonaController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PersonaController.class);

    @Autowired
    //private PersonaRepository personaRepository;
    private PersonaService personaService;

    @RequestMapping("/personaTest")
    public String personaTest (@RequestParam(value="name", defaultValue = "Esteban") String name){
        return "anda: " + name;
    }

    @GetMapping
    public List<Persona> findAll(){
        System.out.println("listarTodas");
        return personaService.listarTodas();
    }

    @GetMapping(path="/save")
    public @ResponseBody
    Persona save(@RequestParam(value="name", defaultValue = "Esteban") String name){
        System.out.println("name: " + name);
        Persona p = new Persona();
        p.setNombre("Fabio");
        p.setApellido("Esteban");
        p.setEdad(47);
        return personaService.save(p);
        //return "saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Persona> getAllPersonas(){
        System.out.println("all");
        return personaService.findAll();
    }

    @PostMapping
    public ResponseEntity<Persona> insert(@Valid @RequestBody Persona request){
    LOGGER.info("insertando Persona {}", request);
    Persona savedPersona = personaService.save(request);
    return ResponseEntity.status(HttpStatus.CREATED).body(savedPersona);

    }

}
