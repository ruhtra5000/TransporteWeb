package br.edu.ufape.transporte.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ufape.transporte.model.Passageiro;

@Repository
public interface PassageiroRepository extends JpaRepository<Passageiro, Long> {

}
