package com.patrycja.lengthconverter.service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertingTest {

    private Converting converting;

    @Before
    public void setUp() {
        converting = new Converting();
    }

    @Test
    public void shouldConvertMeterToCentimeters() {
        double expected = 100;
        double actual = converting.convert(1, 2);
        assertEquals(expected, actual, 0.0);

    }

    @Test
    public void shouldConvertMillimetreToCentimeter() {
        double expected = 0.1;
        double actual= converting.convert(1, -1);
        assertEquals(expected,actual,0.0);
    }

    @Test
    public void shouldConvertKilometreToMillimetres() {
        double expected = 1000000;
        double actual= converting.convert(1, 6);
        assertEquals(expected,actual,0.0);
    }

    @Test
    public void wordIsNotNum() {
        boolean actual = converting.isNum("word");
        assertEquals(false,actual);
    }

    @Test
    public void is12Num() {
        boolean actual = converting.isNum("12");
        assertEquals(true, actual);
    }
}