package br.ufrj.repository;

import br.ufrj.model.Measures;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeasuresRepository extends JpaRepository<Measures, Long> {
}
