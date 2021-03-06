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
@Table(name="Diet")
public class Diet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private Float basalMetabolicRate;

    private Float caloriesGoal;

    private Float protein;

    private Float carbohydrate;

    private Float fat;
    
    @OneToMany
    @JoinColumn(name="diet_id")
    private List<Meal> meals;
}
