package ru.job4j.condition;

/**
 * Расчет расстояния между точками.
 *
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
   * И это поле объекта. Оно доступно только конкретному объекту.
   */
  private int z;

  /**
   * Конструктор, который принимает начальное состояние объекта "точка"
   *
   * @param x координата x
   * @param y координата y
   */
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  /**
   * Конструктор, который принимает начальное состояние объекта "точка" в 3D
   *
   * @param x координата x
   * @param y координата y
   * @param z координата z
   */
  public Point(int x, int y, int z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  /**
   * Расчет расстояния между точками.
   *
   * @param that экземпляр класса Point для вычисления расстояния.
   * @return расстояние.
   */
  public double distance(Point that) {
    double result = Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    return result;
  }

  /**
   * Расчет расстояния между точками в 3D
   *
   * @param that экземпляр класса Point для вычисления расстояния.
   * @return расстояние.
   */
  public double distance3d(Point that) {
    double result = Math.sqrt(
        Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2) + Math.pow(this.z - that.z, 2));
    return result;
  }

  public void info() {
    System.out.println(String.format("Point[%s, %s]", this.x, this.y));
  }
}
