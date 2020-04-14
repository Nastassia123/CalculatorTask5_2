package com.epam.automation.testsJUnit;

import com.epam.automation.baseConfigurations.BaseTest;
import org.junit.Assert;
import org.junit.Test;


public class DivCalcJunit extends BaseTest {

    @Test
    public void testDivisionOperationWithJUnit() {
        long result = calculator.div(400000000L, 100000000L);
        Assert.assertTrue(result == 4);
    }
}
