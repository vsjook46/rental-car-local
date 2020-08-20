package pan.edu.welcome_spring.form;

import java.util.Objects;

public class ClientForm {
    private String id;
    private String surName;
    private String name;
    private String address;
    private int phoneNumber;

    public ClientForm() {
    }

    public ClientForm(String surName, String name, String address, int phoneNumber) {
        this.surName = surName;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public ClientForm(String id, String surName, String name, String address, int phoneNumber) {
        this.id = id;
        this.surName = surName;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientForm that = (ClientForm) o;
        return phoneNumber == that.phoneNumber &&
                Objects.equals(id, that.id) &&
                Objects.equals(surName, that.surName) &&
                Objects.equals(name, that.name) &&
                Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surName, name, address, phoneNumber);
    }
}
