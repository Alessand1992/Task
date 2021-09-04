package kg.Alessand.Task.model.dto;

import kg.Alessand.Task.model.Car;
import lombok.Data;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.sql.Date;
@Data
public class ParkingDto {

    private Long id;
    private Car car;
    private int place;
    private Date startDate;
    private Date endDate;
    private boolean onPark;
}
