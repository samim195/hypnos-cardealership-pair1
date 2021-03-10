package com.hypnos.carDealership.models;
import javax.persistence.*;

@Entity
@Table(name ="BOOKINGS")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "USER_ID")
    private User user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CAR_ID")
    private Car car;
}
