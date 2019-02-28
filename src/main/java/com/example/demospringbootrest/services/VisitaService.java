package com.example.demospringbootrest.services;

import com.example.demospringbootrest.Repositories.VisitaRepository;
import com.example.demospringbootrest.models.Visita;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class VisitaService {
    @Autowired
    private VisitaRepository visitaRepo;

    public List<Visita> findAll(){
        List<Visita> visitas = visitaRepo.findAll();
        return visitas;
    }
}
