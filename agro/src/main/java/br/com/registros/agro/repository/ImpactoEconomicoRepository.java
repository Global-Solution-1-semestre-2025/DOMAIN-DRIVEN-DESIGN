package br.com.registros.agro.repository;

import br.com.registros.agro.domain.ImpactoEconomico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImpactoEconomicoRepository extends JpaRepository<ImpactoEconomico, Long> {
}

