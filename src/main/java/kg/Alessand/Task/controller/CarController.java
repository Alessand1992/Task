package kg.Alessand.Task.controller;

import io.swagger.annotations.Api;
import kg.Alessand.Task.model.Car;
import kg.Alessand.Task.model.dto.CarDto;
import kg.Alessand.Task.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static kg.Alessand.Task.config.Swagger2Config.CAR;

@Api(tags = CAR)
@RestController
@RequestMapping(value = "/Car")
public class CarController {

    @Autowired
    private CarService carService;

    @PutMapping("/save")
    private CarDto save(@ModelAttribute CarDto carDto){
        return carService.save(carDto);
    }

    @GetMapping("/findAll")
    private List<Car> findAll(){
        return carService.findAll();
    }
    @GetMapping("/findById")
    private CarDto findById(){
        return carService.findById();
    }
}
