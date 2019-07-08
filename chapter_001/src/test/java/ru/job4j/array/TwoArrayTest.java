package ru.job4j.array;

import org.junit.Test;


import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TwoArrayTest {
    @Test
    public void whenArray12And34Then1234() {
        TwoArray twoArray = new TwoArray();
        int[] input1 = {1, 2};
        int[] input2 = {3, 4};
       int[] result =  twoArray.merge(input1, input2);
       int[] expect = {1, 2, 3, 4};
       assertThat(result, is(expect));
    }
    @Test
    public void whenArray4567And12Then456712() {
        TwoArray twoArray = new TwoArray();
        int[] input1 = {4, 5, 6, 7};
        int[] input2 = {1, 2};
        int[] result =  twoArray.merge(input1, input2);
        int[] expect = {4, 5, 6, 7, 1, 2};
        assertThat(result, is(expect));
    }
}
