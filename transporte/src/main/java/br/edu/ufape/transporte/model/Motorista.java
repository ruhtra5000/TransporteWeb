package br.edu.ufape.transporte.model;

import java.util.List;

import br.edu.ufape.transporte.model.interfaces.Avaliavel;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
public class Motorista extends Pessoa implements Avaliavel {
    // Atributos
    private String cnh;
    private double avaliacaoGeral;
    private List<Integer> avaliacoes;

    @OneToMany
    private List<Veiculo> veiculos;

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
