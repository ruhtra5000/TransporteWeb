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
public abstract class Pagamento {
    // Atributos
    @Id
    @GeneratedValue
    private long id;
    private double valor;

    // Métodos
    public abstract boolean processarPagamento();
}
