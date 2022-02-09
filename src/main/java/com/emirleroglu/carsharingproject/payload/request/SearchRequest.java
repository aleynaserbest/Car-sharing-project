package com.emirleroglu.carsharingproject.payload.request;

import java.util.Date;

public class SearchRequest {
    private Date date;
    private Long fromStationId;
    private Long toStationId;
    private Integer timeRangeId;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getFromStationId() {
        return fromStationId;
    }

    public void setFromStationId(Long fromStationId) {
        this.fromStationId = fromStationId;
    }

    public Long getToStationId() {
        return toStationId;
    }

    public void setToStationId(Long toStationId) {
        this.toStationId = toStationId;
    }

    public Integer getTimeRangeId() {
        return timeRangeId;
    }

    public void setTimeRangeId(Integer timeRangeId) {
        this.timeRangeId = timeRangeId;
    }
}
