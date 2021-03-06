package com.epam.automation.testsTestNG;

import com.epam.automation.baseConfigurations.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CatangensCalcTest extends BaseTest {

    @Test(dataProvider = "valuesForCtg", description = "Testing Ctg method")
    public void testCotangensFunctionWithTestNG(double value, double result) {
        double actual = calculator.ctg(Math.toRadians(value));
        Assert.assertEquals(actual, result, "Invalid result of Ctg operation");
    }


    @DataProvider(name = "valuesForCtg")
    public Object[][] valuesForCtg() {
        return new Object[][]{
                {30, Math.sqrt(3)},
                {45, 1},
                {270, 0}
        };
    }
}

