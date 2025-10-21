package br.edu.ufape.transporte.model;

import java.math.BigDecimal;
import java.util.List;

import br.edu.ufape.transporte.model.interfaces.Avaliavel;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
public class Passageiro extends Pessoa implements Avaliavel {
    // Atributos
    private BigDecimal saldo;
    private List<Integer> avaliacoes;

    // Métodos
    @Override
    public void receberAvaliacao(int nota) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'receberAvaliacao'");
    }
    @Override
    public double getMediaAvaliacoes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMediaAvaliacoes'");
    }
}
