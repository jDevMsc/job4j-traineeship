package ru.job4j.array;

/**
 * 6.0. Заполнить массив степенями чисел.[#154566]
 *
 * @author Artem Luzan(artemmoscowpro@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Square {

  /**
   * Инициализируем массив.
   *
   * @param bound - размер массива.
   * @return массив
   */
  public int[] calculate(int bound) {
    int[] rstArr = new int[bound];
    int num = 1;
    for (int i = 0; i < bound; i++) {
      rstArr[i] = num * num;
      num += 1;
    }
    return rstArr;
  }
}
