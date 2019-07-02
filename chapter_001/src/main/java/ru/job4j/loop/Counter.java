package ru.job4j.loop;

/**
 * Подсчет суммы чётных чисел в диапазоне[#154560]
 * @author Artem Luzan(artemmoscowpro@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Counter {
    /**
     * Подсчет суммы чётных чисел в диапазоне.
     * @param start вычисляем ОТ этого числа.
     * @param finish вычисляем ДО этого числа.
     * @return сумма.
     */
    public int add(int start, int finish) {
        int sum = 0;
        for(int i = start;i<=finish;i++){
            if(i%2==0){
                sum+=i;
                continue;
            }
        }
        return sum;
    }
}