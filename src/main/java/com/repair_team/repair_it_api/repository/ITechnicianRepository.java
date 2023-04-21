package com.repair_team.repair_it_api.repository;

import com.repair_team.repair_it_api.entities.Technician;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITechnicianRepository extends JpaRepository<Technician, Long> {
}