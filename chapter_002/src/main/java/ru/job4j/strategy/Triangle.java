package ru.job4j.strategy;
/**
 * Класс треугольник, реализующий интерфейс.
 * @author Artem Luzan(artemmoscowpro@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Triangle implements Shape {
  /**
   * Реализует метод draw , интерфейса.
   * @return возвращшает строку треугольник
   */
  @Override
  public String draw() {
    StringBuilder pic = new StringBuilder();
    pic.append("  +  \n");
    pic.append(" +++ \n");
    pic.append("+++++\n");
    return pic.toString();
  }
}
