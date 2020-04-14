package com.epam.automation.testsTestNG;

import com.epam.automation.baseConfigurations.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsNegativeTest extends BaseTest {

    @Test(dataProvider = "valuesForIsNegativeTest")
    public void testIsNegativeValueWithPositiveParamTestNG(long value, boolean expected){
    boolean result = calculator.isNegative(value);
    Assert.assertEquals(result, expected, "Is negative operation has been failed");
    }

    @DataProvider(name = "valuesForIsNegativeTest")
    Object[][] isNegative() {
        return new Object[][]{
                {1, false},
                {-45, true},
                {0, false}
        };
    }
}
