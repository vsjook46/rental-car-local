package pan.edu.welcome_spring.model;

import java.time.LocalDateTime;
import java.util.Objects;


public class Client {
    private String id;
    private int code;
    private String surName;
    private String name;
    private String middleName;
    private String address;
    private int phoneNumber;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;

    public Client() {
    }

    public Client(String surName, String name, String address, int phoneNumber) {
        this.surName = surName;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Client(int code, String surName, String name, String middleName, String address, int phoneNumber) {
        this.code = code;
        this.surName = surName;
        this.name = name;
        this.middleName = middleName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Client(String id, int code, String surName, String name, String middleName, String address, int phoneNumber, LocalDateTime createdAt, LocalDateTime updateAt) {
        this.id = id;
        this.code = code;
        this.surName = surName;
        this.name = name;
        this.middleName = middleName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
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
        Client client = (Client) o;
        return code == client.code &&
                phoneNumber == client.phoneNumber &&
                Objects.equals(id, client.id) &&
                Objects.equals(surName, client.surName) &&
                Objects.equals(name, client.name) &&
                Objects.equals(middleName, client.middleName) &&
                Objects.equals(address, client.address) &&
                Objects.equals(createdAt, client.createdAt) &&
                Objects.equals(updateAt, client.updateAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, surName, name, middleName, address, phoneNumber, createdAt, updateAt);
    }
}
