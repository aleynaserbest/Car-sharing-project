package com.emirleroglu.carsharingproject.repository;

import com.emirleroglu.carsharingproject.models.Travel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface TravelRepository extends JpaRepository<Travel,Long> {

    List<Travel> findAllByUserId(Long userId);




  //  @Query("select t from Travel t where t.date = ?1 and t.fromStation = ?2")
  //  List<Travel> findByDateAndFromStation(Date date,);
    List<Travel> findByDate(Date date);

   // @Query("select t from Travel t where t.date = ?1 and t.fromStation = ?2 and t.toStation = ?3 and t.timeRange = ?4")
    List<Travel> findByDateAndFromStationIdAndToStationIdAndTimeRangeId(Date date,Long fromStationId,Long toStationId,Integer timeRangeId);
}
