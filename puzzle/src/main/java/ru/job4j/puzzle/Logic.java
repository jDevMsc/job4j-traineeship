package ru.job4j.puzzle;

import ru.job4j.puzzle.firuges.Cell;
import ru.job4j.puzzle.firuges.Figure;

/**
 * //TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Logic {

  private final int size;
  private final Figure[] figures;
  private int index = 0;

  public Logic(int size) {
    this.size = size;
    this.figures = new Figure[size * size];
  }

  public void add(Figure figure) {
    this.figures[this.index++] = figure;
  }

  public boolean move(Cell source, Cell dest) {
    boolean rst = false;
    int index = this.findBy(source);
    if (index != -1) {
      Cell[] steps = this.figures[index].way(source, dest);
      if (this.isFree(steps)) {
        rst = true;
        this.figures[index] = this.figures[index].copy(dest);
      }
    }
    return rst;
  }

  public boolean isFree(Cell... cells) {
    boolean result = cells.length > 0;
    for (Cell cell : cells) {
      if (this.findBy(cell) != -1) {
        result = false;
        break;
      }
    }
    return result;
  }

  public void clean() {
    for (int position = 0; position != this.figures.length; position++) {
      this.figures[position] = null;
    }
    this.index = 0;
  }

  private int findBy(Cell cell) {
    int rst = -1;
    for (int index = 0; index != this.figures.length; index++) {
      if (this.figures[index] != null && this.figures[index].position().equals(cell)) {
        rst = index;
        break;
      }
    }
    return rst;
  }

  public boolean isWin() {
    int[][] table = this.convert();
    boolean result = false;
    for (int i = 0; i < table.length; i++) { //Проверяем только диагональ на  ==1
      if (table[i][i] == 1) { //если 1, подсчитываем сумму по столбцу и колонке
        result = true;
        int countCol = 0;
        int countRow = 0;
        for (int j = 0; j < table[0].length; j++) { //Подсчитываем сумму по столбцу и колонке
          countCol += table[i][j]; //сумма по колонке
          countRow += table[j][i]; //сумма по строке
        }
        if (countCol > 1 && countCol != table.length) {
          return false;
        }
        if (countRow > 1 && countRow != table.length) {
          return false;
        }
        return result;
      }
    }

    return result;
  }

  public int[][] convert() {
    int[][] table = new int[this.size][this.size];
    for (int row = 0; row != table.length; row++) {
      for (int cell = 0; cell != table.length; cell++) {
        int position = this.findBy(new Cell(row, cell));
        if (position != -1 && this.figures[position].movable()) {
          table[row][cell] = 1;
        }
      }
    }
    return table;
  }
}


/*for (int i = 0; i <  table.length ; i++) { //строка
        for (int j = 0; j <table[0].length ; j++) { //колонка
        if(table[i][j]==1){
        if(j >= 1 && table[i + 1][j] == 1 && i < 1) { //проверяем вертикаль
        for (int k = 0; k < table.length - i ; k++) {
        if (table[i][j] != table[i + k][j]) {
        return false; //несовпадение по вертикали
        }
        }
        return true;//несовпадений нет
        }else if(i >= 1 && table[i][j +1 ] == 1 && j < 1){ //проверяем горизонталь
        for (int k = 0; k < table[0].length - j ; k++) {
        if (table[i][j] != table[i][j + k]) {
        return false;//несовпадение по горизонтали
        }
        }
        return true;//несовпадений нет
        }
        return false;// если было ==1, но не подошло не одно условие false
        }
        }
        }*/