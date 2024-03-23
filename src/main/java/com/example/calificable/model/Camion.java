package com.example.calificable.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // entidad de la base de datos
@Data // genera los getters y setters
@NoArgsConstructor // genera el constructor vacio
@AllArgsConstructor // genera el constructor con todos los atributos
public class Camion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String marca;
    private String modelo;
    private Integer capacidadcarga;


}
