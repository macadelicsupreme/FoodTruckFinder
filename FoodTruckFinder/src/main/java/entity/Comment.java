package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Comment {
    @Id
    @GeneratedValue
    private String id;
    private String description;
    private User user;
    private FoodTruck foodTruck;
    private Vote vote;


}
