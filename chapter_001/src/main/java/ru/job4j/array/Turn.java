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
        int[] rstArr = array;
        for (int i = 0; i < rstArr.length - 1 - i; i++) {
            int temp = rstArr[i];
            rstArr[i] = rstArr[rstArr.length - 1 - i];
            rstArr[rstArr.length - 1 - i] = temp;
        }
        return rstArr;
    }
}