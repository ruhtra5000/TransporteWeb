package br.edu.ufape.transporte.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Rota {
    // Atributos
    @Id
    @GeneratedValue
    private long id;
    private List<String> pontos;
    private double distanciaTotal;
}
