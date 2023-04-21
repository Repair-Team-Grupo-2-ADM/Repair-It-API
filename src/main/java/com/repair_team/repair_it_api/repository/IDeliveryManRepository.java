package com.repair_team.repair_it_api.repository;

import com.repair_team.repair_it_api.entities.DeliveryMan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDeliveryManRepository extends JpaRepository<DeliveryMan, Long> {
}