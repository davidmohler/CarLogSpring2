package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dmacc.beans.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long>{  

}
