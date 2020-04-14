package com.epam.automation.testsTestNG;

import com.epam.automation.baseConfigurations.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.epam.tat.module4.Calculator;


public class SinCalcTest extends BaseTest {

 @Test(dataProvider = "valuesForSin", description = "Testing Sin method")
    public void testSinesFunctionWithTestNG(double value, double result) {
        double actual = calculator.sin(value);
        Assert.assertEquals(actual, result, "Invalid result of Sin operation");
    }

    
    @DataProvider(name = "valuesForSin")
    public Object[][] valuesForSin() {
        return new Object[][] {
                { 0, 0 },
                { -3, 1 },
                { 1, 1 }
        };
    }

}


