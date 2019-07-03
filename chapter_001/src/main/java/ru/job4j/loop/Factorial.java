package ru.job4j.loop;

/**
 * Создать программу, вычисляющую факториал.[#154561]
 * @author Artem Luzan(artemmoscowpro@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Factorial {
    /**
     * Программа, вычисляет факториал.
     * @param n вычисляем факториал этого числа.
     * @return факториал числа.
     */
    public int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}