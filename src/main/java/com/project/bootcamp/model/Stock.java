package com.project.bootcamp.model;

    //as classes Entity são feitas para serem um reflexo das tabelas do banco de dados. Uma para cada tabela
    //a Entity Stock será reflexo da tb_stock

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_stock")
public class Stock {

    @Id
    @SequenceGenerator(name = "auto_gen", sequenceName = "1")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "auto_gen")//Se o DB estivesse fazendo o Auto Incremento, colocaríamos IDENTITY no lugar de AUTO
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Double price;

    @Column(name = "variation")
    private Double variation;

    @Column(name = "date")
    private LocalDate date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getVariation() {
        return variation;
    }

    public void setVariation(Double variation) {
        this.variation = variation;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
