package ru.job4j.converter;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(60);
        assertThat(result, is(1));
    }

    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(70);
        assertThat(result, is(1));
    }

    @Test
    public void when10DollarToRubleThen600() {
        Converter converter = new Converter();
        int result = converter.dollarToRuble(10);
        assertThat(result, is(600));
    }

    @Test
    public void when10EuroToRublethen700() {
        Converter converter = new Converter();
        int result = converter.euroToRuble(10);
        assertThat(result, is(700));
    }

}
