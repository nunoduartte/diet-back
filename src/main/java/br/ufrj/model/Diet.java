package br.ufrj.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="Diet")
public class Diet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private Integer basalMetabolicRate;

    private Integer caloriesGoal;

    private Integer protein;

    private Integer carbohydrate;

    private Integer fat;
}
