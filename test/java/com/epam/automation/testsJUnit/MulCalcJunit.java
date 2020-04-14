package com.epam.automation.testsJUnit;

import com.epam.automation.baseConfigurations.BaseTest;
import org.junit.Assert;
import org.junit.Test;


public class MulCalcJunit extends BaseTest {

    @Test
    public void testMultiplicationOperationWithJUnit() {
        long result = calculator.mult(999L, 1000000L);
        Assert.assertTrue(result == 999000000L);
    }
}
