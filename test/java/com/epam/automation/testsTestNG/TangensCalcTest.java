package com.epam.automation.testsTestNG;

import com.epam.automation.baseConfigurations.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TangensCalcTest extends BaseTest {

 @Test(dataProvider = "valuesForTg", description = "Testing Tg method")
    public void testTangensFunctionWithTestNG(double value, double result) {
        double actual = calculator.tg(Math.toRadians(value));
        Assert.assertEquals(actual, result, "Invalid result of Tg operation");
    }


    @DataProvider(name = "valuesForTg")
    public Object[][] valuesForTg() {
        return new Object[][] {
                { 0, 0 },
                { 45, 1 },
                { 60, Math.sqrt(3) },
                { 180, 0 }
        };
    }
}

