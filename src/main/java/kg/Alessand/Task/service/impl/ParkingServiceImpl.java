package kg.Alessand.Task.service.impl;

import kg.Alessand.Task.dao.ParkingRepo;
import kg.Alessand.Task.mapper.ParkingMapper;
import kg.Alessand.Task.model.Parking;
import kg.Alessand.Task.model.dto.ParkingDto;
import kg.Alessand.Task.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ParkingServiceImpl implements ParkingService {
    @Autowired
    ParkingRepo parkingRepo;
    @Override
    public List<Parking> findAll() {
        return parkingRepo.findAll();
    }

    @Override
    public ParkingDto save(ParkingDto parkingDto) {
        Parking parking = ParkingMapper.INSTANCE.toParking(parkingDto);
        parking = parkingRepo.save(parking);
        return ParkingMapper.INSTANCE.toParkingDto(parking);
    }

    @Override
    public ParkingDto update(ParkingDto parkingDto) {
        return null;
    }

    @Override
    public ParkingDto delete(ParkingDto parkingDto) {
        return null;
    }

    @Override
    public ParkingDto findByPlace(ParkingDto parkingDto) {
        return null;
    }

    @Override
    public ParkingDto Emptys(ParkingDto parkingDto) {

        return null;
    }

    @Override
    public ParkingDto findById() {
        return null;
    }
}
