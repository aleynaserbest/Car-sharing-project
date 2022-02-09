package com.emirleroglu.carsharingproject.controllers;

import com.emirleroglu.carsharingproject.models.Town;
import com.emirleroglu.carsharingproject.repository.TownRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)  // CORS policy
@RestController
@RequestMapping("/api/town")
public class TownController {
    @Autowired
    TownRepository townRepository;

    @GetMapping("/getList")
    public List<Town> getList () {
        return townRepository.findAll();
    }
}
