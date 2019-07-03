package ru.job4j.condition;

/**
 * Расчет площади прямоугольника
 * @author Artem Luzan(artemmoscowpro@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class SqArea {
    /**
     * Расчет площади прямоугольника.
     * @param p Периметр прямоугольника.
     * @param k высота больше ширины в k раз.
     * @return площадь.
     */
    public int square(int p, int k) {
        int w = p / 4 * k;
        int h = p / 2 - w;
        int square =  w * h;
        return square;
    }
}