package kg.Alessand.Task.service.impl;

import kg.Alessand.Task.dao.CarRepo;
import kg.Alessand.Task.mapper.CarMapper;
import kg.Alessand.Task.model.Car;
import kg.Alessand.Task.model.dto.CarDto;
import kg.Alessand.Task.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarServiceImpl implements CarService {
    @Autowired
    CarRepo carRepo;

    @Override
    public List<Car> findAll() {
        return carRepo.findAll();
    }

    @Override
    public CarDto save(CarDto carDto) {
        Car car = CarMapper.INSTANCE.toCar(carDto);
        car =carRepo.save(car);
        return CarMapper.INSTANCE.toCarDto(car);
    }

    @Override
    public CarDto findById(Long id) {
        return null;
    }
    @Override
    public CarDto findByNumber(String number) {
        return null;
    }
}
