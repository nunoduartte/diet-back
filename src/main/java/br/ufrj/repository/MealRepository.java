package br.ufrj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ufrj.model.Meal;

@Repository
public interface MealRepository extends JpaRepository<Meal, Long> {
}