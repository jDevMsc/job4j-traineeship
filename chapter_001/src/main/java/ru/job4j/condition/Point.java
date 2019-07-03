package ru.job4j.condition;

/**
 * Расчет расстояния между точками.
 * @author Artem Luzan(artemmoscowpro@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Point {
    /**
     * Расчет расстояния между точками.
     * @param x1 Коорджината X первой точки.
     * @param x2 Коорджината X второй точки.
     * @param y1 Коорджината Y первой точки.
     * @param y2 Коорджината Y второй точки.
     * @return расстояние.
     */
    public double distance(int x1, int y1, int x2, int y2) {
        double result = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return result;
    }
}
