package kg.Alessand.Task.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
@Data
@Entity
@Table
public class Parking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JoinColumn(name = "Car_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Car car;
    private int place;
    private Date startDate;
    private Date endDate;
    @Column(name = "on_park")
    private boolean onPark;

}
