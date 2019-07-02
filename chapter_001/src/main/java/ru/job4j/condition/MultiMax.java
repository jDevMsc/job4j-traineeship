package ru.job4j.condition;

/**
 * @author Artem Luzan(artemmoscowpro@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class MultiMax {

    /**
     * Расчет расстояния между точками.
     * @param first первое число для сравнения.
     * @param second второе число для сравнения.
     * @param third  третье число для сравнения.
     * @return большее число.
     */
    public int max(int first, int second, int third) {
        int result = first > second ? first : second;
        return result>third ? result : third;
    }
}
