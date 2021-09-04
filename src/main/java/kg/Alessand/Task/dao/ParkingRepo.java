package kg.Alessand.Task.dao;

import kg.Alessand.Task.model.Parking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingRepo extends JpaRepository<Parking,Long> {
}
