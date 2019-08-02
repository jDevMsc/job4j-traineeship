package ru.job4j.start;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StartUITest {

  @Test
  public void whenAddNewItem() {
    Tracker tracker = new Tracker();
    StubInput stubInput = new StubInput(new String[]{"0", "test name", "desc", "6"});
    Input input = stubInput;
    new StartUI(input, tracker).init();
    assertThat(tracker.findAll()[0].getName(), is(new Item("test name", "desc").getName()));
  }

  @Test
  public void whenShowAllItem() {
      }

  @Test
  public void whenEditItem() {
    Tracker tracker = new Tracker();
    Item item = tracker.add(new Item("test name", "desc"));
    StubInput stubInput = new StubInput(new String[]{"2", item.getId(), "test replace", "заменили заявку", "6"});
    Input input = stubInput;
    new StartUI(input, tracker).init();
    // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
    assertThat(tracker.findById(item.getId()).getName(), is(new Item("test replace", "заменили заявку").getName()));
  }

  @Test
  public void wheDeleteItem(){
    Tracker tracker = new Tracker();
    Item item = tracker.add(new Item("test name", "desc"));
    Item item2 = tracker.add(new Item("test2 name", "desc2"));
    Input input = new StubInput(new String[]{"3", item.getId(), "6"});
    new StartUI(input, tracker).init();
    assertThat(tracker.findAll(),is(new Item[]{item2}));
  }

  @Test
  public void wheFindById(){
  }

  @Test
  public void wheFindByName(){
  }
}