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
        int[] array2 = array;
        for (int i = 0; i < array2.length - 1 - i; i++) {
            int temp = array2[i];
            array2[i] = array2[array2.length - 1 - i];
            array2[array2.length - 1 - i] = temp;
        }
        return array2;
    }
}