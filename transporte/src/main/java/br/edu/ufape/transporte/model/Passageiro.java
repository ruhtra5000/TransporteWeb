package br.edu.ufape.transporte.model;

import java.math.BigDecimal;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

import br.edu.ufape.transporte.model.enums.StatusCorrida;
import br.edu.ufape.transporte.model.enums.TipoCorrida;
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
    public Corrida solicitarCorrida(TipoCorrida tipoCorrida, String origem, String destino){
        Corrida corrida;
        if(tipoCorrida == TipoCorrida.ECONOMICA)
            corrida = new CorridaEconomica();
        else
            corrida = new CorridaPremium();

        corrida.setOrigem(origem);
        corrida.setDestino(destino);
        corrida.setPassageiro(this);
        corrida.setStatus(StatusCorrida.SOLICITADA);

        //Talvez precise adicionar outros campos

        return corrida;
    }

    public void pagar(double valor){
        if(this.saldo.doubleValue() >= valor)
            this.saldo.subtract(new BigDecimal(valor));
        else
            throw new InvalidParameterException("Valor maior que saldo");
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
        int totalSoma = 0;
        for (Integer avaliacao : avaliacoes) 
            totalSoma += avaliacao;
        
        return (double) totalSoma/this.avaliacoes.size();
    }
}
