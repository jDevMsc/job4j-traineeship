package ru.job4j.strategy;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TriangleTest {

  @Test
  public void whenDrawTriangle() {
    Triangle triangle = new Triangle();
    assertThat(triangle.draw(), is(new StringBuilder()
        .append("  +  \n")
        .append(" +++ \n")
        .append("+++++\n")
        .toString()));
  }

}

