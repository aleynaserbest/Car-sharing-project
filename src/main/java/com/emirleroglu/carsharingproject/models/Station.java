package com.emirleroglu.carsharingproject.models;

import javax.persistence.*;

@Entity
@Table(name = "stations")
public class Station {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String stationname;

    @ManyToOne(fetch = FetchType.EAGER)
    private Town town;

    public Station() {
    }

    public Station(Long id, String stationname, Town town) {
        this.id = id;
        this.stationname = stationname;
        this.town = town;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStationname() {
        return stationname;
    }

    public void setStationname(String stationname) {
        this.stationname = stationname;
    }

    public Town getTown() {
        return town;
    }

    public void setTown(Town town) {
        this.town = town;
    }
}
