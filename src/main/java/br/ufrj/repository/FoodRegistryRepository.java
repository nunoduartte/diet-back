package br.ufrj.repository;

import br.ufrj.model.FoodRegistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FoodRegistryRepository extends JpaRepository<FoodRegistry, Long> {
    @Query("select fr from FoodRegistry fr join fr.user u where u.id = :id and DATE(fr.registryDate) = DATE(NOW())")
    List<FoodRegistry> findAllByUserIdInTheSameDay(Long id);
}
