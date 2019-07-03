package ru.job4j.condition;

/**
 * @author Artem Luzan(artemmoscowpro@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Max {

    /**
     * Возвращаем максимальное число.
     * @param left Первое число для сравнения.
     * @param right Второе число для сравнения.
     * @return большее число.
     */
    public int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }
}