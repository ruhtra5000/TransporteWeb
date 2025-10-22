package br.edu.ufape.transporte.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
public class PagamentoPix extends Pagamento {
    // Atributos
    private String chavePix;

    // Métodos
    @Override
    public boolean processarPagamento() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'processarPagamento'");
    }
}
