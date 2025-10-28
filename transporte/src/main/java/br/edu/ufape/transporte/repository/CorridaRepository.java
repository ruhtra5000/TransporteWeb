package br.edu.ufape.transporte.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.stereotype.Repository;

import br.edu.ufape.transporte.model.Corrida;
import br.edu.ufape.transporte.model.Motorista;
import br.edu.ufape.transporte.model.Passageiro;
import br.edu.ufape.transporte.model.enums.StatusCorrida;

@Repository
public interface CorridaRepository extends JpaRepository<Corrida, Long> {

    List<Corrida> findAllByStatus (StatusCorrida statusCorrida);
    
    @NativeQuery("SELECT * FROM corrida WHERE corrida.motorista = :motorista")
    List<Corrida> findAllCorridaByMotorista (Motorista motorista);

    @NativeQuery("SELECT * FROM corrida WHERE corrida.passageiro = :passageiro")
    List<Corrida> findAllCorridaByPassageiro (Passageiro passageiro);
} 