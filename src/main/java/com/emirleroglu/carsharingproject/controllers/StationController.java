package com.emirleroglu.carsharingproject.controllers;

import com.emirleroglu.carsharingproject.models.Station;
import com.emirleroglu.carsharingproject.repository.StationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/station")
public class StationController {

    @Autowired
    StationRepository stationRepository;

    @GetMapping("/getList/{townId}")
    List<Station> getListByTownID(@PathVariable Long townId) {
        return stationRepository.findByTownId(townId);
    }
}

