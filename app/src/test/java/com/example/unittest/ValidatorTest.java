package com.example.unittest;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorTest {

    @Test
    public void converterFahrenheitToCelsius() throws Exception{

        float input = 212;
        float output;
        float expected = 100;
        double delta = .1;

        Validator validator = new Validator();
        output = validator.converterFahrenheitToCelsius(input);
        assertEquals(expected,output,delta);

    }

    @Test
    public void all_days() throws Exception{

        int input = 10;
        int output;
        int expected = 100;
        double delta = .1;

        Validator validator = new Validator();
        output = validator.all_days(input);
        assertEquals(expected,output,delta);

    }

    @Test
    public void lenght() throws Exception{

        String input = "n";
        Boolean output;
        Boolean expected = true;

        Validator validator = new Validator();
        output = validator.lenght(input);
        assertEquals(expected,output);

    }


    @Test
    public void name() throws Exception{

        String input = "hassan";
        String output;
        String expected = "hassan";

        Validator validator = new Validator();
        output = validator.name(input);
        assertEquals(expected,output);

    }

}