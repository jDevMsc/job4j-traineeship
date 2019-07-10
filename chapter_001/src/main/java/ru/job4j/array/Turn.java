package ru.job4j.array;

/**
 * 6.2. Перевернуть массив.[#154576]
 * @author Artem Luzan(artemmoscowpro@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Turn {
    /**
     * Method переворачивания массива.
     * @param array массив для работы.
     * @return измененный массив
     */
    public int[] back(int[] array) {
        int[] rst_arr = array;
        for (int i = 0; i < rst_arr.length - 1 - i; i++) {
            int temp = rst_arr[i];
            rst_arr[i] = rst_arr[rst_arr.length - 1 - i];
            rst_arr[rst_arr.length - 1 - i] = temp;
        }
        return rst_arr;
    }
}