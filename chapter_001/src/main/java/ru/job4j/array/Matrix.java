package ru.job4j.array;
/**
 * 6.6. Двухмерный массив. Таблица умножения.[#154568]
 * @author Artem Luzan(artemmoscowpro@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Matrix {
    /**
     * Method создания таблицы умножения.
     * @param size размерность массива.
     * @return возвращает заполненный массив
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {
                table[i][j] = (i + 1) * (j + 1);
                System.out.printf("%3d", table[i][j]);
            }
            System.out.println();

        }
        return table;
    }
}