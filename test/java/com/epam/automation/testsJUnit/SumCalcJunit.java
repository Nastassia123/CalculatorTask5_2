package com.epam.automation.testsJUnit;

import com.epam.automation.baseConfigurations.BaseTest;
import org.junit.Assert;
import org.junit.Test;


public class SumCalcJunit extends BaseTest {

    @Test
    public void testSummationOperationWithJUnit() {
        long result = calculator.sum(1111111111L, 8888888888L);
        Assert.assertTrue(result == 9999999999L);
    }
}
