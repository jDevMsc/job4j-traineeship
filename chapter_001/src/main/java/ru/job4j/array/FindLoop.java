package ru.job4j.array;
/**
 * 6.1. Классический поиск перебором.[#154567]
 * @author Artem Luzan(artemmoscowpro@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class FindLoop {
    /**
     * Method поиска элемента в массиве.
     * @param data массив для поиска.
     * @param el элемент, который надо найти.
     * @return индекс элемента если он есть в массиве, иначе -1.
     */
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }
}