package ru.job4j.array;
import java.util.Arrays;
/**
 * 6.5. Создать программу для сортировки массива методом перестановки.[#154573].
 * @author Artem Luzan(artemmoscowpro@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class ArrayDuplicate {
    /**
     * Метод удаления дублей.
     * @param array массив для проверки.
     * @return массив без дублей
     */
    public String[] remove(String[] array) {
        int leng = array.length;
        for (int i = 0; i < leng; i++) {
            for (int j = i + 1; j < leng; j++) {
                if (array[i].equals(array[j])) {
                    array[j] = array[leng - 1];
                    leng--;
                    j--;
                }
            }
        }
        return  Arrays.copyOf(array, leng);
    }
}

