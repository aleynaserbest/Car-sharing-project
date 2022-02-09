package com.emirleroglu.carsharingproject.repository;


import com.emirleroglu.carsharingproject.models.ERole;
import com.emirleroglu.carsharingproject.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
