package ru.job4j.array;

public class TwoArray {

  public int[] merge(int[] left, int[] right) {
    int[] thirdArray = new int[left.length + right.length];

    int lInd = 0;
    int rInd = 0;

    for (int i = 0; i < thirdArray.length; i++) {
      if (lInd == left.length) {
        System.arraycopy(right, rInd, thirdArray, i, thirdArray.length - i);
        break;
      }
      if (rInd == right.length) {
        System.arraycopy(left, lInd, thirdArray, i, thirdArray.length - i);
        break;
      }

      if (left[lInd] < right[rInd]) {
        thirdArray[i] = left[lInd];
        lInd++;
      } else if (left[lInd] > right[rInd]) {
        thirdArray[i] = right[rInd];
        rInd++;
      }
    }
    return thirdArray;
  }
}
