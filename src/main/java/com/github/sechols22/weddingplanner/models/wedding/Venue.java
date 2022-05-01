package com.github.sechols22.weddingplanner.models.wedding;

@SuppressWarnings("unused")

public class Venue {

    private Address address;
    private double cost;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
