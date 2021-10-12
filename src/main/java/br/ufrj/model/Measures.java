package br.ufrj.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="Measures")
public class Measures {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private Integer weight;

    private Integer height;

    private Integer neck;

    private Integer waist;

    private Integer hip;

    private Integer bodyFat;

}
