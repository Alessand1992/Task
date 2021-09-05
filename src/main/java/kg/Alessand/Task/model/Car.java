package kg.Alessand.Task.model;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Car_id")
    private Long id;
    private String carNumber;

}

