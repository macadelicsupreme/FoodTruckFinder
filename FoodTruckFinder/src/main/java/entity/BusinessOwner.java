package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;

@Getter
@Entity
public class BusinessOwner {
    @Id
    @GeneratedValue
    private String id;
    private String username;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private FoodTruck foodTruck;

    @OneToOne
    public void setFoodTruck(FoodTruck foodTruck) {
        this.foodTruck = foodTruck;
    }
    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
