package br.ufrj.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Meal")
public class Meal {
    
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	
	private long diet_id;
    
	private String name;
	
	@OneToMany
	@JoinColumn(name="meal_id")
	private List<Food> foods;
}
