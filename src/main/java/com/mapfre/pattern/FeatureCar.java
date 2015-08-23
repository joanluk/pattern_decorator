package com.mapfre.pattern;

/**
 * User: jose
 * Date: 22/8/15
 * Time: 23:19
 */
public abstract class FeatureCar {

    private String description;

    private float cost;

    public String getDescription() {
        return description;
    }

    public abstract float getCost();

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
