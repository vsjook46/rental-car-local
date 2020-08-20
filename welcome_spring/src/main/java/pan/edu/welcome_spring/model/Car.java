package pan.edu.welcome_spring.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;

@Document

public class Car {
    private String id;
    private String mark;
    private int price;
    private double rentPrice;
    private String type;
    private LocalDateTime createdAt, updatedAt;
    private String rentStart, rentEnd;

    public Car() {
    }

    public Car(String mark, double rentPrice, String type, String rentStart, String rentEnd) {
        this.mark = mark;
        this.rentPrice = rentPrice;
        this.type = type;
        this.rentStart = rentStart;
        this.rentEnd = rentEnd;

    }

    public Car(String id, String mark, int price, double rentPrice, String type) {
        this.id = id;
        this.mark = mark;
        this.price = price;
        this.rentPrice = rentPrice;
        this.type = type;
    }

    public Car(String id, String mark, int price, double rentPrice, String type, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.mark = mark;
        this.price = price;
        this.rentPrice = rentPrice;
        this.type = type;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(double rentPrice) {
        this.rentPrice = rentPrice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getRentStart() {
        return rentStart;
    }

    public void setRentStart(String rentStart) {
        this.rentStart = rentStart;
    }

    public String getRentEnd() {
        return rentEnd;
    }

    public void setRentEnd(String rentEnd) {
        this.rentEnd = rentEnd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price &&
                Double.compare(car.rentPrice, rentPrice) == 0 &&
                Objects.equals(id, car.id) &&
                Objects.equals(mark, car.mark) &&
                Objects.equals(type, car.type) &&
                Objects.equals(createdAt, car.createdAt) &&
                Objects.equals(updatedAt, car.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mark, price, rentPrice, type, createdAt, updatedAt);
    }

}
