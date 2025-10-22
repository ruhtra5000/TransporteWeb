package br.edu.ufape.transporte.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
public class PagamentoCartao extends Pagamento {
    // Atributos
    private String numeroCartao;

    // Métodos
    @Override
    public boolean processarPagamento() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'processarPagamento'");
    }
}
