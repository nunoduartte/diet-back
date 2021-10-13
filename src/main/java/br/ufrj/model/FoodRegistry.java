package br.ufrj.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class FoodRegistry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    private User user;

    private String description;
    private float amount;
    private float code;
    private float carbohydrate;
    private Date registryDate =  new Date();
    private float protein;
    private float fat;
}
