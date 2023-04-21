package com.repair_team.repair_it_api.repository;

import com.repair_team.repair_it_api.entities.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDeviceRepository extends JpaRepository<Device, Long> {
}