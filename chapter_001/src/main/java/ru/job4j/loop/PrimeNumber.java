package ru.job4j.loop;
/**
 * 5.5. Простые числа. [#156314]
 * @author Artem Luzan(artemmoscowpro@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class PrimeNumber {
    /**
     * Подсчитать кол-во простыъ чисел по число finish
     * @param finish подсчет по это число.
     * @return кол-во простых чисел.
     */
    public int calc(int finish) {
        int count = 0;
        for (int i = 2; i <= finish; i++) { // Иду по числам до finish
            boolean primeNumber = true;

            for (int j = 2; j < i; j++) { // Иду по делителям числа
                if (i % j == 0) {
                    primeNumber = false;
                    break;
                }
            }
            if (primeNumber) {
                count++;
            }
        }
        return count;
        }
    }