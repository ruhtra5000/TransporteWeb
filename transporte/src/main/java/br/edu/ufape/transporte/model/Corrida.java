package br.edu.ufape.transporte.model;

import br.edu.ufape.transporte.model.enums.StatusCorrida;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Corrida {
    // Atributos
    @Id
    @GeneratedValue
    private long id;
    private String origem;
    private String destino;
    
    @Enumerated(EnumType.STRING)
    private StatusCorrida status;

    @ManyToOne
    private Passageiro passageiro;

    @ManyToOne
    private Motorista motorista;

    @OneToOne
    private Pagamento pagamento;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private Rota rota;

    // Métodos
    public abstract double calcularTarifa();

    public void iniciar(){
        // To do
    }

    public void finalizar(){
        // To do
    }
}
