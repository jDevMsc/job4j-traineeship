package ru.job4j.strategy;
/**
 * Класс отрисовки.
 * @author Artem Luzan(artemmoscowpro@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Paint {

  /**
   * Отрисовка в зависимости от передаваемого объекта
   * @param shape Принимает объект типв Shape.
   */
  public void draw(Shape shape) {
    System.out.println(shape.draw());
  }

}
