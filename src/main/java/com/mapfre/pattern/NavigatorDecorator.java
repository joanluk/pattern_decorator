package com.mapfre.pattern;

/**
 * User: jose
 * Date: 22/8/15
 * Time: 23:33
 */
public class NavigatorDecorator extends ExtraDecorator {

    FeatureCar featureCar;

    public NavigatorDecorator(FeatureCar featureCar) {
         this.featureCar = featureCar;
    }


    @Override
    public String getDescription() {

        return featureCar.getDescription() + ", navigator";
    }

    @Override
    public float getCost() {
        return featureCar.getCost() + 5000f;
    }
}
