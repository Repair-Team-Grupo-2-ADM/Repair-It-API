package com.repair_team.repair_it_api.repository;

import com.repair_team.repair_it_api.entities.RepairService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepairServiceRepository extends JpaRepository<RepairService, Long> {
}