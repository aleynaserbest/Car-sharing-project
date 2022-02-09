package com.emirleroglu.carsharingproject.controllers;

import com.emirleroglu.carsharingproject.models.TimeRange;
import com.emirleroglu.carsharingproject.repository.TimeRangeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/timerange")
public class RangeController {

    @Autowired
    TimeRangeRepository timeRangeRepository;



    @GetMapping("/getList")
    public List<TimeRange> getTimeRangeList() {
        List<TimeRange> myTimeRangeList = timeRangeRepository.findAll();
        return  myTimeRangeList;
    }



}
