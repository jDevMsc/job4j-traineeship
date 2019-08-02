package ru.job4j.array;
/**
 * Соединить два массива
 * @author Artem Luzan(artemmoscowpro@gmail.com)
 */
public class TwoArray {
  /**
   * Method соединяет два массива.
   * @param left массив для работы.
   * @param right массив для работы.
   * @return измененный массив
   */
  public int[] merge(int[] left, int[] right) {
    int[] thirdArray = new int[left.length + right.length];

    int lInd = 0;
    int rInd = 0;



    while (lInd < left.length && rInd < right.length) {

      if ( left[lInd] < right[rInd]) {
        thirdArray[lInd + rInd] = left[lInd];
        lInd++;
      } else if (left[lInd] > right[rInd]) {
        thirdArray[lInd + rInd] = right[rInd];
        rInd++;
      }

      if (lInd >= left.length) {
        while(rInd<right.length) {
          thirdArray[lInd + rInd] = right[rInd];
          rInd++;
        }
      } else if (rInd >= right.length) {
        while(lInd<left.length) {
          thirdArray[lInd + rInd] = left[lInd];
          lInd++;
        }
      }
    }
    return thirdArray;
  }
}
