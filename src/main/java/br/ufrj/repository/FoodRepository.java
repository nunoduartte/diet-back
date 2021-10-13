package br.ufrj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ufrj.model.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {
}