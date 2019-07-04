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
        int dupl = array.length;
        for (int i = 0; i < dupl; i++) {
            for (int j = i + 1; j < dupl; j++) {
                if (array[i].equals(array[j])) {
                    array[j] = array[dupl - 1];
                    dupl--;
                    j--;
                }
            }
        }
        return  Arrays.copyOf(array, dupl);
    }

}
