package ru.job4j.array;
/**
 * 6.3. Массив заполнен true или false[#154570]
 * @author Artem Luzan(artemmoscowpro@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Check {
    /**
     * Method проверки заполненности массива true или false.
     * @param data массив для проверки.
     * @return true или false  в зависимости от содержимого массива
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] != data[i + 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}