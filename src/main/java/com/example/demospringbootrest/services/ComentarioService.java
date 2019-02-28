package com.example.demospringbootrest.services;

import com.example.demospringbootrest.Repositories.ComentarioRepository;
import com.example.demospringbootrest.exceptions.NotFoundException;
import com.example.demospringbootrest.models.Comentario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;

@Service
@Transactional
public class ComentarioService {

    @Autowired
    private ComentarioRepository comentarioRepo;

    public List<Comentario> findAll(){
        List<Comentario> comentarios = comentarioRepo.findAll();
        return comentarios;
    }

    public Comentario save(Comentario c){
        return comentarioRepo.save(c);
    }

    public void deleteById(Long id){
        comentarioRepo.deleteById(id);
    }

    public Comentario getById(Long id){
        Comentario comentario = this.comentarioRepo.findById(id).orElseThrow(NotFoundException::new);
        return comentario;
    }

    public String mostrar(Long id){
        Comentario comentario = this.getById(id);
        System.out.println("mostrado comentario: " + comentario);
        return "mostrado";
    }
}
