package com.emirleroglu.carsharingproject.models;

import javax.persistence.*;

@Entity
@Table(name = "towns")
public class Town {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Town(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Town() {
    }

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
}
