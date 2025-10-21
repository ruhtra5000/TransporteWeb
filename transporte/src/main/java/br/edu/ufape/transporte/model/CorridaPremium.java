package br.edu.ufape.transporte.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
public class CorridaPremium extends Corrida {

    // Métodos
    @Override
    public double calcularTarifa() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularTarifa'");
    }
    
}
