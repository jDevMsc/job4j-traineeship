package ru.job4j.condition;

/**
 * @author Artem Luzan(artemmoscowpro@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Max {

  /**
   * Возвращаем максимальное число.
   *
   * @param first Первое число для сравнения.
   * @param second Второе число для сравнения.
   * @return большее число.
   */
  public int max(int first, int second) {
    int result = first > second ? first : second;
    return result;
  }

  /**
   * Возвращаем максимальное число.
   *
   * @param first Первое число для сравнения.
   * @param second Второе число для сравнения.
   * @param third Третье число для сравнения.
   * @return большее число.
   */
  public int max(int first, int second, int third) {
    int result = max(first, max(second, third));
    return result;
  }

  /**
   * Возвращаем максимальное число.
   *
   * @param first Первое число для сравнения.
   * @param second Второе число для сравнения.
   * @param third Третье число для сравнения.
   * @param fourth Четвертое число для сравнения.
   * @return большее число.
   */
  public int max(int first, int second, int third, int fourth) {
    int result = max(first, max(second, max(third, fourth)));
    return result;
  }
}