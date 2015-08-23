package com.mapfre.pattern;

/**
 * User: jose
 * Date: 22/8/15
 * Time: 23:26
 */
public class MercedesCar extends FeatureCar {



    @Override
    public float getCost() {

        return 30000f;
    }

    public String getDescription() {
        return "Mercedes Car" ;
    }
}
