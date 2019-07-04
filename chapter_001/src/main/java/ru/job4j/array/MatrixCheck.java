package ru.job4j.array;
/**
 * 6.7. Квадратный массив заполнен true или false по диагоналям.[#154571]
 * @author Artem Luzan(artemmoscowpro@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class MatrixCheck {
    /**
     * Method проверка диоганалей массива.
     * @param data массив для проверки.
     * @return возвращает истинно или ложь
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
                if (data[0][0] != data[i][i] || data[0][data.length - 1] != data[i][data.length - i - 1]) {
                    return  false;
                }
        }
        return result;
    }

}