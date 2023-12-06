package entity;

import jakarta.persistence.Entity;

import java.util.Date;

@Entity
public class FoodTruck {
    private String id;
    private String name;
    private String location;
    private Date time;
    private BusinessOwner businessOwner;
    private User user;
    private Comment commments;
    private Vote votes;
}
