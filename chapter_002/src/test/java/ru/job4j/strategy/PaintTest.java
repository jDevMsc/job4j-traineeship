package ru.job4j.strategy;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PaintTest {

  @Test
  public void whenDrawSquare() {
    // получаем ссылку на стандартный вывод в консоль.
    PrintStream stdout = System.out;
    // Создаем буфур для хранения вывода.
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    //Заменяем стандартный вывод на вывод в пямять для тестирования.
    System.setOut(new PrintStream(out));
    // выполняем действия пишушиее в консоль.
    new Paint().draw(new Square());
    // проверяем результат вычисления
    assertThat(
        new String(out.toByteArray()),
        is(
            new StringBuilder()
                .append("++++\n")
                .append("+  +\n")
                .append("++++\n")
                .append(System.lineSeparator())
                .toString()
        )
    );
    // возвращаем обратно стандартный вывод в консоль.
    System.setOut(stdout);
  }

  @Test
  public void whenDrawTriangle() {
    PrintStream outDefault = System.out;
    ByteArrayOutputStream  byteArrayOutputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(byteArrayOutputStream));
    new Paint().draw(new Triangle());
    assertThat(new String(byteArrayOutputStream.toByteArray()),is(new StringBuilder()
        .append("  +  \n")
        .append(" +++ \n")
        .append("+++++\n")
        .append(System.lineSeparator())
        .toString()));
    System.setOut(outDefault);
  }

}
