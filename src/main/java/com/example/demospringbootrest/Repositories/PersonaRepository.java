package com.example.demospringbootrest.Repositories;

import com.example.demospringbootrest.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
    //List<Persona> findByNombre(@Param("nombre") String nombre, Pageable pageable);
}
