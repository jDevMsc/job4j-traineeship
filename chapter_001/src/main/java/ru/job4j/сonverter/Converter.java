package ru.job4j.сonverter;

/**
 * Корвертор валюты.
 * @author Artem Luzan(artemmoscowpro@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Converter {

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        int euroRate = 70;
        return value / euroRate;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары
     */
    public int rubleToDollar(int value) {
        int dollarRate = 60;
        return value / dollarRate;
    }

    /**
     * Конвертируем доллары в рубли.
     * @param value доллары.
     * @return Рубли
     */
    public int dollarToRuble(int value) {
        int dollarRate = 60;
        return value * dollarRate;
    }

    /**
     * Конвертируем евро в рубли.
     * @param value евро.
     * @return Рубли
     */
    public int euroToRuble(int value) {
        int euroRate = 70;
        return value * euroRate;
    }


}
