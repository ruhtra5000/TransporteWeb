package br.edu.ufape.transporte.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
public class CorridaEconomica extends Corrida {

    // Métodos
    @Override
    public double calcularTarifa() {
        return (this.getRota().getDistanciaTotal() * 1.2);
    }
    
}
