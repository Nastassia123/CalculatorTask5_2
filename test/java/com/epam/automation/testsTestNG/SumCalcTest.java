package com.epam.automation.testsTestNG;


import com.epam.automation.baseConfigurations.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumCalcTest extends BaseTest {

    @Test(dataProvider = "longParamsForSumTest")
    public void testSummationWithLongValuesTestNG(long a, long b,long expectedResult) {
        long result = calculator.sum(a, b);
        Assert.assertEquals(result, expectedResult,  "Invalid result value of sum operation with long params");
    }

    @DataProvider(name = "longParamsForSumTest")
    public Object[][] valuesForSum() {
        return new Object[][]{
                {-1000000000000000000L, -222222222L, -1222222222L},
                {3999999998888888888L, -5000000L, 394999999L},
                {0L, 1999999999777777L, 1999999999L},
                {-3100000007777777777L, 1000000000L, 690000000L},
                {0L, 0L, 0L},
        };
    }

    @Test(dataProvider = "doubleParamsForSumTest")
    public void testSummationWithDoubleValuesTestNG(double a, double b, double expectedResult) {
        double result = calculator.sum(a, b);
        Assert.assertEquals(result, expectedResult,  "Invalid result value of sum operation with double params");
    }

    @DataProvider(name = "doubleParamsForSumTest")
    public Object[][] doublevaluesForSum() {
        return new Object[][]{
                {-1.0, -2.0, -3.0},
                {3.0, -5.0, -2.0},
                {0.0, 1.0, 1.0},
                {-310.0, 10.0, -300.0},
                {0.0, 0.0, 0.0},
        };
    }
}
