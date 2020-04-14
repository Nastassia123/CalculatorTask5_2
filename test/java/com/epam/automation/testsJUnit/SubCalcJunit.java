package com.epam.automation.testsJUnit;

import com.epam.automation.baseConfigurations.BaseTest;
import org.junit.Assert;
import org.junit.Test;


public class SubCalcJunit extends BaseTest {

    @Test
    public void testSubstructionOperationWithJUnit() {
        long result = calculator.sub(999999999L, 888888888L);
        Assert.assertTrue(result == 111111111L);
    }
}
