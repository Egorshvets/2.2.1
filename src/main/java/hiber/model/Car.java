package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carID;

    private String model;

    @OneToOne(mappedBy = "car")
    private User user;

    private int series;

    public Car() {
    }

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carID=" + carID +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}
