package br.com.registros.agro.repository;

import br.com.registros.agro.domain.ImpactoAmbiental;
import br.com.registros.agro.domain.Queimada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImpactoAmbientalRepository extends JpaRepository<ImpactoAmbiental, Long> {
}

