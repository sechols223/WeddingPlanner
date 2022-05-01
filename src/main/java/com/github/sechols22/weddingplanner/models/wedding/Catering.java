package com.github.sechols22.weddingplanner.models.wedding;

import java.util.HashMap;

@SuppressWarnings("unused")

public class Catering {

    /**
     * name of the catering service
     */
    private String caterer;
    /**
     * Hashmap with value String: name of food, Double: amount of trays
     */
    private HashMap<String, Double> foodList;
    private double cost;

    public String getCaterer() {
        return caterer;
    }

    public void setCaterer(String caterer) {
        this.caterer = caterer;
    }

    public HashMap<String, Double> getFoodList() {
        return foodList;
    }

    public void setFoodList(HashMap<String, Double> foodList) {
        this.foodList = foodList;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
