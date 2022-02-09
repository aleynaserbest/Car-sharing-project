package com.emirleroglu.carsharingproject.repository;

import com.emirleroglu.carsharingproject.models.Town;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TownRepository extends JpaRepository<Town,Long> {

}
