package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {

  @Test
  public void whenAddNewItemThenTrackerHasSameItem() {
    Tracker tracker = new Tracker();
    long created = System.currentTimeMillis();
    Item item = new Item("test1", "testDescription", created);
    tracker.add(item);
    Item result = tracker.findById(item.getId());
    assertThat(result.getName(), is(item.getName()));
  }

  @Test
  public void whenReplaceItemThenTrackerHasSameItem() {
    Tracker tracker = new Tracker();
    Item item = new Item("test1", "testDescription", 1232l);
    tracker.add(item);
    Item item2 = new Item("test2", "testDescription", 123l);
    item2.setId(item.getId());
    boolean result = tracker.replace(item.getId(), item2);
    System.out.println(result);
    assertThat(tracker.findById(item.getId()).getName(), is("test2"));
  }

  @Test
  public void whenFindByName() {
    Tracker tracker = new Tracker();
    Item item = new Item("test1", "testDescription", 1232l);
    Item item2 = new Item("test2", "testDescription", 123l);
    Item item3 = new Item("test3", "testDescription", 1234l);
    tracker.add(item);
    tracker.add(item2);
    tracker.add(item3);
    Item[] result = tracker.findByName("test2");
    assertThat(result.length, is(1));
  }

  @Test
  public void whenAddItemThenDeleteAndFindAll() {
    Tracker tracker = new Tracker();
    Item item = new Item("test1", "testDescription", 11l);
    Item item2 = new Item("test2", "testDescription2", 12l);
    Item item3 = new Item("test3", "testDescription3", 13l);
    tracker.add(item);
    tracker.add(item2);
    tracker.add(item3);
    tracker.delete(item.getId());
    Item result = tracker.findById(item.getId());
    assertThat(tracker.findAll()[0], is(item2));

  }
}