package ru.job4j.array;

public class TwoArray {

    public int[]  merge(int[] left, int[] right) {
        int[] thirdArray = new int[left.length + right.length];
        System.arraycopy(left, 0, thirdArray, 0, left.length);
        System.arraycopy(right, 0, thirdArray,  left.length, right.length);
        return thirdArray;
    }
}
