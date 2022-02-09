package com.emirleroglu.carsharingproject.models;

import javax.persistence.*;

@Entity
@Table(name = "timeranges")
public class TimeRange {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private String value;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public TimeRange(Integer id, String value) {
        this.id = id;
        this.value = value;
    }

    public TimeRange() {

    }
}
