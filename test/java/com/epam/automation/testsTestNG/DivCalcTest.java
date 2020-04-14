package com.epam.automation.testsTestNG;

import com.epam.automation.baseConfigurations.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivCalcTest extends BaseTest {

    @Test(groups = "testDivision", dataProvider = "doubleValuesForDivision")
    public void testDivOperationWithDoubleValuesTestNG(double a, double b, double expected){
       double result =  calculator.div(a, b);
       Assert.assertEquals(result,expected, "Incorrect result of division operation with double params");
    }


    @DataProvider(name = "doubleValuesForDivision")
    Object [][] doubleValuesForDivision(){
        return new Object[][]{
                {1.0, 0, 1.0},
                {0, 1.0, 0},
                {90.0, -10.0, -9.0 },
                {135.0, -1.0, -135.0},
                {-10, -10, -10}
        };
    }

    @Test(groups = "testDivision", dataProvider = "longValuesForDivision")
    public void testDivOperationWithLongValuesTestNG(long a, long b, long expected){
        long result =  calculator.div(a,b);
        Assert.assertEquals(result, expected, "Incorrect result of division operation with long params");
    }


    @DataProvider(name = "longValuesForDivision")
    Object [][] longValuesForDivision(){
        return new Object[][]{
                {1000000000000000L, -1000000000000000L, -1L},
                {-4545454545454545454L, 1L, -4545454545454545454L},
                {0L, 1200000000000000000L, 0},
                {1200000000L, 1200567567567657560L, 0L}
        };
    }


   @Test
    public void testDivisionOperationByZero() {
        long result = calculator.div(4, 0);
        Assert.assertEquals(result, new NumberFormatException("Attempt to divide by zero"), "Division by zero test is failed");
    }

}
