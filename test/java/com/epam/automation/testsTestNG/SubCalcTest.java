package com.epam.automation.testsTestNG;

import com.epam.automation.baseConfigurations.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubCalcTest extends BaseTest {

    @Test(groups = "divisionTest", dataProvider = "longParamsForSub")
    public void testSubstractionWithLongValuesTestNG(long a, long b, long expected) {
        long result = calculator.sub(a, b);
        Assert.assertEquals(result, expected, "Invalid result value of sub operation with long values");
    }

    @DataProvider(name = "longParamsForSub")
    Object[][] longValuesForSub() {
        return new Object[][]{
                {-1000000000L, -1L, -999999999L},
                {999999999L, -1L, 1000000000L},
                {-1111111111L, -888888888L, -222222223L},
                {1350000000L, 0L, 1350000000L},
                {0L, 1200000000L, -1200000000L}
        };
    }

    @Test(groups = "divisionTest", dataProvider = "doubleParamsForSub")
    public void testSubstractionWithDoubleValuesTestNG(double a, double b, double expected) {
        double result = calculator.sub(a, b);
        Assert.assertEquals(result, expected, "Invalid result value of sub operation with double values");
    }

    @DataProvider(name = "doubleParamsForSub")
    Object[][] doubleValuesForSub() {
        return new Object[][]{
                {-1.0, -1.0, 0},
                {-3.9, 1.5, -5.4},
                {90.0, -45.0, 135.0},
                {135.0, 0.0, 135.0},
                {0.0, 120.0, -120.0}
        };
    }
}
