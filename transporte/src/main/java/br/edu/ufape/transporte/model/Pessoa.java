package br.edu.ufape.transporte.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pessoa {
    // Atributos
    @Id
    @GeneratedValue
    private long id;
    private String nome;
    private String cpf;
    private String telefone;
}