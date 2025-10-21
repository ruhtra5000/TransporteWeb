package br.edu.ufape.transporte.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Veiculo {
    // Atributos
    @Id
    @GeneratedValue
    private long id;
    private String placa;
    private String modelo;
    private int capacidade;
}
