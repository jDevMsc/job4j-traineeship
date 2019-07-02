package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    @Test
    public void whenAddOnePlusOneThenTwo(){
        Calculator calc = new Calculator();
        double result = calc.add(1D,1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenOneDivOneThenOne(){
        Calculator calc = new Calculator();
        double result = calc.add(1D,1D);
        double expected = 1D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenOneSubtractOneThenZero(){
        Calculator calc = new Calculator();
        double result = calc.add(1D,1D);
        double expected = 0D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenOneMultiplyOneThenOne(){
        Calculator calc = new Calculator();
        double result = calc.add(1D,1D);
        double expected = 1D;
        assertThat(result, is(expected));
    }

}
