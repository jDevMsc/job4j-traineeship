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
        for (int i = 2; i <= finish; i++) { //5
            boolean primeNumber = true;

            for (int j = 2; j <= i / 2; j++) {
                if(i % j == 0){
                    primeNumber = false;
                    break;
                }
            }
            if(primeNumber == true){
                count++;
            }

        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(new PrimeNumber().calc(2));

    }
}