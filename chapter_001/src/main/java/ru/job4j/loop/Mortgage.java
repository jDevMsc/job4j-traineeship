package ru.job4j.loop;

/**
 * Программа рассчета выплат по кредиту.[#154561]
 * @author Artem Luzan(artemmoscowpro@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Mortgage {
    /**
     * Метод рассчета выплат по кредиту.
     * @param amount Сумма кредита.
     * @param monthly Ежемесячная плата.
     * @param percent Годовой процент.
     * @return кол-во лет на выплату.
     */
    public int year(int amount, int monthly, double percent) {
        int year = 0;
        double percPerYear = amount +  amount * percent / 100; //Сумма за год с процентами
        int amountPerYear = monthly * 12; //Сумма за 12 месяцев
        if (percPerYear <= amountPerYear) { //проверяю можно ли расплатиться за год
            year++;
        }
        while (percPerYear >= amountPerYear) { //Проверяю, что сумма кредита, больше, чем сумма оплат за год
            year++;
            percPerYear -= amountPerYear;    //Вычитаю из суммы кредита, сумму за 12 месяцев
            if (percPerYear <= amountPerYear) { //Если оставшаяся сумма < суммы оплат за год.
                year++;
            }
        }
        return year;
    }

}