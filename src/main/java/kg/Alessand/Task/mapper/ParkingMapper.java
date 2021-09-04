package kg.Alessand.Task.mapper;

import kg.Alessand.Task.model.Car;
import kg.Alessand.Task.model.Parking;
import kg.Alessand.Task.model.dto.CarDto;
import kg.Alessand.Task.model.dto.ParkingDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

import static org.mapstruct.factory.Mappers.getMapper;

@Mapper
public interface ParkingMapper {

    ParkingMapper INSTANCE = getMapper(ParkingMapper.class);

    Parking toParking(ParkingDto parkingDto);
    ParkingDto toParkingDto(Parking parking);
    List<Parking> toParkingList(List<ParkingDto> parkingDtoList);
    List<ParkingDto> toParkingDtoList(List<Parking> parkingList);
}
