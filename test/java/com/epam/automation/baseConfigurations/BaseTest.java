package com.epam.automation.baseConfigurations;

import com.epam.tat.module4.Calculator;
import org.junit.*;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseTest {

    protected Calculator calculator;

    @Before
    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }

    @After
    @AfterClass
    public void tearDown() {
        calculator = null;
    }

}
