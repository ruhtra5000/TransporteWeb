package br.edu.ufape.transporte.model;

import java.util.ArrayList;
import java.util.List;

import br.edu.ufape.transporte.model.interfaces.Avaliavel;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
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

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private Veiculo veiculo;

    // Métodos
    public void aceitarCorrida(Corrida corrida) {
        // To do
    }

    @Override
    public void receberAvaliacao(int nota) {
        if(this.avaliacoes == null) {
            avaliacoes = new ArrayList<Integer>();
        }
        avaliacoes.add(nota);
    }

    @Override
    public double getMediaAvaliacoes() {
        if(this.avaliacoes == null || this.avaliacoes.isEmpty())
            return 3.0;
        
        int totalSoma = 0;
        for (Integer avaliacao : avaliacoes) 
            totalSoma += avaliacao;
        
        return (double) totalSoma/this.avaliacoes.size();
    }
}
