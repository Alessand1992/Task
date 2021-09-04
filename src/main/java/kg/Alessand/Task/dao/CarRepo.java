package kg.Alessand.Task.dao;

import kg.Alessand.Task.model.Car;
import kg.Alessand.Task.model.dto.CarDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepo extends JpaRepository<Car,Long> {

}
