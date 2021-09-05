package kg.Alessand.Task.service;

import kg.Alessand.Task.model.Parking;
import kg.Alessand.Task.model.dto.ParkingDto;

import java.util.Collection;
import java.util.List;

public interface ParkingService {
    List<Parking> findAll();
    ParkingDto save(ParkingDto parkingDto);
    ParkingDto update(ParkingDto parkingDto);
    ParkingDto delete(ParkingDto parkingDto);
    ParkingDto findByPlace(ParkingDto parkingDto);
    ParkingDto Emptys(ParkingDto parkingDto);

    ParkingDto findById();

    Collection<Parking> findAllCarOnParking();

    int updateParkingStatusOnFalse(Boolean onPark);

    int updateParkingStatusOnFalse(Long id);

    public int freeParkingPlace();
}
