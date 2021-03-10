package com.hypnos.carDealership.models;

import com.hypnos.carDealership.enums.Brand;
import com.hypnos.carDealership.enums.Colour;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "CARS")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne(mappedBy = "car", cascade = CascadeType.ALL)
    private Booking booking;

    @NotNull
    @Column(name = "brand")
    private Brand brand;

    @NotNull
    @Column(name = "colour")
    private Colour colour;

    @NotNull
    @NotEmpty
    @Column(name = "year")
    private String year;

    @NotNull
    @Column(name = "mileage")
    private int mileage;

    @NotNull
    @Column(name = "engineSize")
    private double engineSize;

    @NotNull
    @Column(name = "isReserved")
    private boolean isReserved;

    public Car(Brand brand, Colour colour, String year, int mileage, double engineSize, boolean isReserved) {
        this.brand = brand;
        this.colour = colour;
        this.year = year;
        this.mileage = mileage;
        this.engineSize = engineSize;
        this.isReserved = isReserved;
    }
}
