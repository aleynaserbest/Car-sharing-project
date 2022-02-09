package com.emirleroglu.carsharingproject.controllers;


import com.emirleroglu.carsharingproject.models.Travel;
import com.emirleroglu.carsharingproject.payload.request.SearchRequest;
import com.emirleroglu.carsharingproject.repository.TravelRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/travel")
public class TravelController {

    @Autowired
    TravelRepository travelRepository;

    @PostMapping("/create")
    public ResponseEntity<Travel> createTravel(@RequestBody Travel travel) {
        travelRepository.save(travel);

        return new ResponseEntity<>(travel, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Travel> updateTravel(@RequestBody Travel travel, @PathVariable Long id) {
        Travel updateTravel = travelRepository.findById(id).get();
        updateTravel.setTimeRange(travel.getTimeRange());
        updateTravel.setDate(travel.getDate());
        updateTravel.setFromStation(travel.getFromStation());
        updateTravel.setToStation(travel.getToStation());

        travelRepository.save(updateTravel);

        return new ResponseEntity<>(updateTravel, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Travel> deleteTravelById(@PathVariable Long id) {
        travelRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/getList")
    List<Travel> getListByUserId(@RequestParam Long userId) {
        return travelRepository.findAllByUserId(userId);
    }

    @PostMapping("/search")
    List<Travel> getSearch(@RequestBody SearchRequest request) {
        return travelRepository.findByDateAndFromStationIdAndToStationIdAndTimeRangeId(request.getDate(), request.getFromStationId(), request.getToStationId(), request.getTimeRangeId());
    }

    @GetMapping("/getListByDate")
    List<Travel> getListByDate(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date date) {
        return travelRepository.findByDate(date);
    }

    @GetMapping("/getTravelById")
    Optional<Travel> getTravelById(@RequestParam Long id) {
        return travelRepository.findById(id);

    }

}
