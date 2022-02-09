package com.emirleroglu.carsharingproject.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "travels")
public class Travel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private User user;
    @ManyToOne
    private TimeRange timeRange;
    @ManyToOne
    private Station fromStation;
    @ManyToOne
    private Station toStation;

    private Date date;

    public Travel(Long id, User user, TimeRange timeRange, Station fromStation, Station toStation, Date date) {
        this.id = id;
        this.user = user;
        this.timeRange = timeRange;
        this.fromStation = fromStation;
        this.toStation = toStation;
        this.date = date;
    }

    public Travel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public TimeRange getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(TimeRange timeRange) {
        this.timeRange = timeRange;
    }

    public Station getFromStation() {
        return fromStation;
    }

    public void setFromStation(Station fromStation) {
        this.fromStation = fromStation;
    }

    public Station getToStation() {
        return toStation;
    }

    public void setToStation(Station toStation) {
        this.toStation = toStation;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
