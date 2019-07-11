package ru.job4j.condition;

/**
 * Расчет расстояния между точками.
 * @author Artem Luzan(artemmoscowpro@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Point {
    /**
     * Это поле объекта. Оно доступно только конкретному объекту.
     */
    private int x;
    /**
     * И это поле объекта. Оно доступно только конкретному объекту.
     */
    private int y;
    /**
     * Конструктор, который принимает начальное состояние объекта "точка"
     * @param first координата x
     * @param second координата y
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }
    public Point(){

    }
    /**
     * Расчет расстояния между точками.
     * @param that экземпляр класса Point для вычисления расстояния.
     * @return расстояние.
     */
    public double distance(Point that) {
        double result = Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
        return result;
    }
    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }
}
