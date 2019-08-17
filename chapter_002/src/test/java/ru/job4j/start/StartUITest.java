package ru.job4j.start;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.hamcrest.core.Is;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StartUITest {

  private final PrintStream stdout = System.out;
  private final ByteArrayOutputStream out = new ByteArrayOutputStream();

  @Before
  public void loadOutput() {
    //Заменяем стандартный вывод на вывод в пямять для тестирования.
    System.setOut(new PrintStream(this.out));
  }

  @After
  public void backOutput() {
    // возвращаем обратно стандартный вывод в консоль.
    System.setOut(this.stdout);
  }

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
    Tracker tracker = new Tracker();
    StubInput stubInput = new StubInput(new String[]{"1","6"});
    Input input = stubInput;
    new StartUI(input, tracker).init();
    assertThat(
        new String(out.toByteArray()),is(
            new StringBuilder()
                .append("0. Add new Item\n")
                .append("1. Show all items\n")
                .append("2. Edit item\n")
                .append("3. Delete item\n")
                .append("4. Find item by Id\n")
                .append("5. Find items by name\n")
                .append("6. Exit Program\n")
                .append("------------ Список ITEM пуст --------------\n")
                .append("\n")
                .append("0. Add new Item\n")
                .append("1. Show all items\n")
                .append("2. Edit item\n")
                .append("3. Delete item\n")
                .append("4. Find item by Id\n")
                .append("5. Find items by name\n")
                .append("6. Exit Program\n")
                .append("------------ Прогармма завершает свою работу --------------")
                .append(System.lineSeparator())
                .toString()
        )
    );

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
    Tracker tracker = new Tracker();
    StubInput stubInput = new StubInput(new String[]{"4","6"});
    Input input = stubInput;
    new StartUI(input, tracker).init();
    assertThat(
        new String(out.toByteArray()),is(
            new StringBuilder()
                .append("0. Add new Item\n")
                .append("1. Show all items\n")
                .append("2. Edit item\n")
                .append("3. Delete item\n")
                .append("4. Find item by Id\n")
                .append("5. Find items by name\n")
                .append("6. Exit Program\n")
                .append("------------ Список ITEM пуст --------------\n")
                .append("\n")
                .append("0. Add new Item\n")
                .append("1. Show all items\n")
                .append("2. Edit item\n")
                .append("3. Delete item\n")
                .append("4. Find item by Id\n")
                .append("5. Find items by name\n")
                .append("6. Exit Program\n")
                .append("------------ Прогармма завершает свою работу --------------")
                .append(System.lineSeparator())
                .toString()
        )
    );
  }

  @Test
  public void wheFindByName(){
    Tracker tracker = new Tracker();
    StubInput stubInput = new StubInput(new String[]{"5","6"});
    Input input = stubInput;
    new StartUI(input, tracker).init();
    assertThat(
        new String(out.toByteArray()),is(
            new StringBuilder()
                .append("0. Add new Item\n")
                .append("1. Show all items\n")
                .append("2. Edit item\n")
                .append("3. Delete item\n")
                .append("4. Find item by Id\n")
                .append("5. Find items by name\n")
                .append("6. Exit Program\n")
                .append("------------ Список ITEM пуст --------------\n")
                .append("\n")
                .append("0. Add new Item\n")
                .append("1. Show all items\n")
                .append("2. Edit item\n")
                .append("3. Delete item\n")
                .append("4. Find item by Id\n")
                .append("5. Find items by name\n")
                .append("6. Exit Program\n")
                .append("------------ Прогармма завершает свою работу --------------")
                .append(System.lineSeparator())
                .toString()
        )
    );
  }
}