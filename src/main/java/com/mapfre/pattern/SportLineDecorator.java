package com.mapfre.pattern;

/**
 * User: jose
 * Date: 22/8/15
 * Time: 23:38
 */
public class SportLineDecorator extends ExtraDecorator {

    private FeatureCar featureCar;

    public SportLineDecorator(FeatureCar featureCar) {
        this.featureCar = featureCar;
    }
    @Override
    public String getDescription() {
        return featureCar.getDescription() + ", Sportline";
    }

    @Override
    public float getCost() {
        return featureCar.getCost() + 4000f;
    }
}
