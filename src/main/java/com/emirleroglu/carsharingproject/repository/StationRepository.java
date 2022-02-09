package com.emirleroglu.carsharingproject.repository;


import com.emirleroglu.carsharingproject.models.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StationRepository extends JpaRepository<Station,Long> {


    List<Station> findByTownId(Long townId);

}
