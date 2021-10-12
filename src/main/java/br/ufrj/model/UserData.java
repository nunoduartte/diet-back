package br.ufrj.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="UserData")
public class UserData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private Integer age;

    private String genre;

    private Biotype biotype;

    private Goal goal;

    @OneToOne
    private Measures measures;

    @OneToOne
    private Diet diet;
}