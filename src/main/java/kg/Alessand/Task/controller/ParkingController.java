package kg.Alessand.Task.controller;

import io.swagger.annotations.Api;
import kg.Alessand.Task.model.Car;
import kg.Alessand.Task.model.Parking;
import kg.Alessand.Task.model.dto.CarDto;
import kg.Alessand.Task.model.dto.ParkingDto;
import kg.Alessand.Task.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static kg.Alessand.Task.config.Swagger2Config.CAR;
import static kg.Alessand.Task.config.Swagger2Config.PARKING;

@Api(tags = PARKING)
@RestController
@RequestMapping(value = "/Parking")
public class ParkingController {
    @Autowired
    ParkingService parkingService;
    @PutMapping("/save")
    private ParkingDto save(@ModelAttribute ParkingDto parkingDto){
        return parkingService.save(parkingDto);
    }

    @GetMapping("/findAll")
    private List<Parking> findAll(){
        return parkingService.findAll();
    }
    @GetMapping("/findById")
    private ParkingDto findById(){
        return parkingService.findById();
    }
    @PutMapping("/updateParkingStatus")
    private int updateParkingStatusOnFalse(@RequestParam("id")Integer id){
        return parkingService.updateParkingStatusOnFalse(false);
    }

}
