package kg.Alessand.Task.controller;

import io.swagger.annotations.Api;
import kg.Alessand.Task.model.dto.CarDto;
import kg.Alessand.Task.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static kg.Alessand.Task.config.Swagger2Config.CAR;

@Api(tags = CAR)
@RestController
@RequestMapping(value = "/Car")
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping("/save")
    private CarDto save(@ModelAttribute CarDto carDto){
        return carService.save(carDto);
    }
}
