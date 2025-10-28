package br.edu.ufape.transporte.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.stereotype.Repository;

import br.edu.ufape.transporte.model.Motorista;

@Repository
public interface MotoristaRepository extends JpaRepository<Motorista, Long> {
    
    @NativeQuery("SELECT * FROM motorista m WHERE m.avaliacaoGeral >= :nota")
    List<Motorista> findAllByNotaMinima (double nota);

    @NativeQuery("SELECT * FROM motorista m WHERE m.veiculo.capacidade >= :capacidade")
    List<Motorista> findAllByCapacidadeMinima (int capacidade);
}
