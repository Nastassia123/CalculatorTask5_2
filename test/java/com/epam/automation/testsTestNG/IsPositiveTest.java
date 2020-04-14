package com.epam.automation.testsTestNG;

import com.epam.automation.baseConfigurations.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsPositiveTest extends BaseTest {

    @Test(dataProvider = "valuesForIsPositiveTest")
    public void testIsNegativeValueWithPositiveParamTestNG(long value, boolean expected){
        boolean result = calculator.isPositive(value);
        Assert.assertEquals(result, expected, "Is positive operation has been failed");
    }

    @DataProvider(name = "valuesForIsPositiveTest")
    Object[][] isNegative() {
        return new Object[][]{
                {-1, false},
                {45, true},
                {0, false}
        };
    }
}