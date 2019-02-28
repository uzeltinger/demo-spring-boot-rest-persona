package com.example.demospringbootrest.services;

import com.example.demospringbootrest.Repositories.PersonaRepository;
import com.example.demospringbootrest.models.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepo;

    public List<Persona> listarTodas(){
        System.out.println("servicio");
        List<Persona> personas = personaRepo.findAll();
        return personas;
    }

    public List<Persona> findAll(){
        System.out.println("servicio");
        List<Persona> personas = personaRepo.findAll();
        return personas;
    }

    public Persona save(Persona p){
        System.out.println("Servicio save saved");
        return personaRepo.save(p);
    }
}
