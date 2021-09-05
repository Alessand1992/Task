package kg.Alessand.Task.dao;

import kg.Alessand.Task.model.Parking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface ParkingRepo extends JpaRepository<Parking,Long> {

    @Modifying
    @Query("SELECT p FROM Parking p WHERE p.onPark = true")
    Collection<Parking> findAllCarOnParking();

    @Modifying
    @Query("UPDATE Parking p SET p.onPark = false where p.id = :id")
    int updateParkingStatusOnFalse(@Param("id")Long id);

}
