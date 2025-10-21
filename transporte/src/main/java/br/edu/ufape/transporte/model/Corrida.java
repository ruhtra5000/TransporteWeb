package br.edu.ufape.transporte.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Corrida {
    // Atributos
    @Id
    @GeneratedValue
    private long id;
    private String origem;
    private String destino;
    //private double distanciaKm; <- Não faz muito sentido
    private StatusCorrida status;

    @ManyToOne
    private Passageiro passageiro;

    @ManyToOne
    private Motorista motorista;

    @OneToOne
    private Pagamento pagamento;

    @OneToOne
    private Rota rota;

    // Métodos
    public abstract double calcularTarifa();
}
