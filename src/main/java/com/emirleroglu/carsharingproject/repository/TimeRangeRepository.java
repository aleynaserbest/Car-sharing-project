package com.emirleroglu.carsharingproject.repository;

import com.emirleroglu.carsharingproject.models.TimeRange;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeRangeRepository extends JpaRepository<TimeRange,Long> {




}
