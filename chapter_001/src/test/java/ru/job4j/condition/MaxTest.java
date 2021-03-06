package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

  @Test
  public void whenMax1To2Then2() {
    Max max = new Max();
    int result = max.max(1, 2);
    assertThat(result, is(2));
  }

  @Test
  public void whenMax3To1Then3() {
    Max max = new Max();
    int result = max.max(3, 1);
    assertThat(result, is(3));
  }

  @Test
  public void when1And2And3Then3() {
    Max max = new Max();
    int result = max.max(1, 1, 3);
    assertThat(result, is(3));
  }

  @Test
  public void when1And2And3And7Then7() {
    Max max = new Max();
    int result = max.max(1, 1, 3, 7);
    assertThat(result, is(7));
  }

}