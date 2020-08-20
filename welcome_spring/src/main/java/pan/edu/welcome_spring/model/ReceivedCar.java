package pan.edu.welcome_spring.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class ReceivedCar {
    private String id;
    private Car car;
    private Client client;
    private String receiveTime;
    private String returningTime;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;

    public ReceivedCar() {
    }

    public ReceivedCar(Car car, Client client, String receiveTime, String returningTime) {
        this.car = car;
        this.client = client;
        this.receiveTime = receiveTime;
        this.returningTime = returningTime;
    }

    public ReceivedCar(String id, Car car, Client client, String receiveTime, String returningTime, LocalDateTime createdAt, LocalDateTime updateAt) {
        this.id = id;
        this.car = car;
        this.client = client;
        this.receiveTime = receiveTime;
        this.returningTime = returningTime;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Client getGroup() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(String receiveTime) {
        this.receiveTime = receiveTime;
    }

    public String getReturningTime() {
        return returningTime;
    }

    public void setReturningTime(String returningTime) {
        this.returningTime = returningTime;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReceivedCar that = (ReceivedCar) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(car, that.car) &&
                Objects.equals(client, that.client) &&
                Objects.equals(receiveTime, that.receiveTime) &&
                Objects.equals(returningTime, that.returningTime) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updateAt, that.updateAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, car, client, receiveTime, returningTime, createdAt, updateAt);
    }
}
