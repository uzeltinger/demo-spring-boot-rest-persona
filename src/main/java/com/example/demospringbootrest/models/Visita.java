package com.example.demospringbootrest.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "visitas")
public class Visita {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    private String solic_nom_institucion;
    private String solic_loc_institucion;
    private LocalDateTime solic_fecha_visita;
    private String solic_hora_visita;
    private int solic_cant_participantes;
    private String solic_grado;
    private String solic_orientacion;
    private String solic_nombre_resp;
    private String solic_apellido_resp;
    private String solic_mail_resp;
    private String solic_telfijo_resp;
    private String solic_cel_resp;
    private String solic_observaciones;
}
