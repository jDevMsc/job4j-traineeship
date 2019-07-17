package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

/**
 * Tracker.
 *
 * @author Artem Luzan(artemmoscowpro@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Tracker {

  private Item[] items = new Item[100];
  private int pozition;
  private static final Random RN = new Random();


  public int lengthItems() {
    return pozition;
  }

  /**
   * Метод добавляет заявку, переданную в аргументах в массив заявок this.items
   *
   * @param item одбавляем новый Item
   * @return переданный item
   */

  public Item add(Item item) {
    item.setId(this.generateId());
    this.items[this.pozition++] = item;
    return item;
  }

  /**
   * Метод должен заменить ячейку в массиве this.items
   *
   * @param id по которому происзодит замена
   * @param item на что меняем
   * @return результат операции
   */

  public boolean replace(String id, Item item) {
    boolean result = false;
    item.setId(id);
    for (int i = 0; i < this.pozition; i++) {
      if (this.items[i] != null && this.items[i].getId().equals(id)) {
        this.items[i] = item;
        result = true;
        break;
      }
    }
    return result;
  }

  /**
   * Метод должен удалить ячейку в массиве this.items и сместить все левее
   *
   * @param id по которому происзодит удаление
   * @return результат операции
   */

  public boolean delete(String id) {
    boolean result = false;
    for (int i = 0; i < pozition; i++) {
      if (this.items[i] != null && this.items[i].getId().equals(id)) {
        System.arraycopy(this.items, i + 1, this.items, i, this.pozition - i);
        this.items[this.items.length - 1] = null;
        result = true;
        this.pozition--;
        break;
      }
    }

    return result;
  }

  /**
   * Метод возвращает копию массива this.items без null элементов
   *
   * @return Item[] дубликат
   */

  public Item[] findAll() {
    Item[] itemDupl = new Item[pozition];
    System.arraycopy(items, 0, itemDupl, 0, pozition);
    return itemDupl;
  }

  /**
   * Метод возвращает массив Item согласно переданому Key
   *
   * @param key ключ для сравнения имени
   * @return Item[] заполненный согласно key
   */

  public Item[] findByName(String key) {
    Item[] result = new Item[this.pozition];
    int positionNew = 0;
    for (int i = 0; i < this.pozition; i++) {
      if (this.items[i] != null && this.items[i].getName().equals(key)) {
        result[positionNew++] = this.items[i];

      }
    }
    return Arrays.copyOf(result, positionNew);
  }

  /**
   * Метод возвращает Item согласно переданному id
   *
   * @param id строка для сравнения
   * @return Item согласно id.
   */

  public Item findById(String id) {
    Item result = null;
    for (int i = 0; i < pozition; i++) {
      if (this.items[i] != null && this.items[i].getId().equals(id)) {
        result = this.items[i];
        break;
      }
    }
    return result;
  }

  /**
   * Метод генерирует уникальный ключ для заявки. Так как у заявки нет уникальности полей, имени и
   * описание. Для идентификации нам нужен уникальный ключ.
   *
   * @return Уникальный ключ.
   */

  private String generateId() {
    return String.valueOf(System.currentTimeMillis() + RN.nextInt());
  }


}
