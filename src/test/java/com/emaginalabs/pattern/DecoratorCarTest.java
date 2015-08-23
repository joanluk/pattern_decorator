package com.emaginalabs.pattern;

import com.mapfre.pattern.FeatureCar;
import com.mapfre.pattern.MercedesCar;
import com.mapfre.pattern.NavigatorDecorator;
import com.mapfre.pattern.SportLineDecorator;

import org.junit.Test;
import  org.junit.Assert;

/**
 * User: jose
 * Date: 22/8/15
 * Time: 23:42
 */
public class DecoratorCarTest {

    @Test
    public void exampleTest() {
        FeatureCar featureCar = new MercedesCar();

        featureCar = new NavigatorDecorator(featureCar);
        featureCar = new SportLineDecorator(featureCar);

        System.out.println(featureCar.getDescription());

        Assert.assertEquals(featureCar.getCost(), 39000f, 0.0);

    }

}
