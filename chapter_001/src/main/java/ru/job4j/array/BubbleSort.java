package ru.job4j.array;
/**
 * Программа сортировки массива
 * @author Artem Luzan(artemmoscowpro@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class BubbleSort {
    /**
     * Method сортировки массива Bubble
     * @param array массив для сортировки.
     * @return отсортированный массив
     */
    public int[] sort(int[] array) {
        int[] fin = array;
        for (int i = 0; i < fin.length; i++) {
            for (int j = 0; j < fin.length - 1 - i; j++) {
                if (fin[j] > fin[j + 1]) {
                    int temp = fin[j];
                    fin[j] = fin[j + 1];
                    fin[j + 1] = temp;
                }
            }
        }
        return  fin;
    }

}
