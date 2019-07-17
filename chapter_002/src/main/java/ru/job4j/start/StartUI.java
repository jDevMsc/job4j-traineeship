package ru.job4j.start;

public class StartUI {

  private static final String ADD = "0";
  private static final String SHOWALL = "1";
  private static final String EDIT = "2";
  private static final String DELETE = "3";
  private static final String FINDID = "4";
  private static final String FINDNAME = "5";
  private static final String EXIT = "6";

  private final Input input;
  private final Tracker tracker;

  public StartUI(Input input, Tracker tracker) {
    this.input = input;
    this.tracker = tracker;
  }

  public static void main(String[] args) {
    new StartUI(new ConsoleInput(), new Tracker()).init();
  }


  public void createItem() {
    System.out.println("------------ Добавление новой заявки --------------");
    String name = this.input.ask("Введите имя заявки :");
    String desc = this.input.ask("Введите описание заявки :");
    Item item = new Item(name, desc);
    this.tracker.add(item);
    System.out
        .println("------------ Новая заявка с getId : " + item.getId() + " добавлена-----------");
    System.out.println(" ");
  }

  public void showAllItem() {
    if (tracker.lengthItems() < 1) {
      System.out.println("------------ Список ITEM пуст --------------");
      System.out.println(" ");
    } else {
      System.out.println("------------ Выводим весь список ITEM --------------");
      Item[] showAll = this.tracker.findAll();
      for (Item item : showAll) {
        System.out.printf("Имя: %s, описание: %s. ", item.getName(), item.getDecs());
        System.out.println(" ");
      }
    }
  }

  public void editItem() {
    if (tracker.lengthItems() < 1) {
      System.out.println("------------ Список ITEM пуст --------------");
      System.out.println(" ");
    } else {
      System.out.println("------------ Начинаем редактирование ITEM --------------");
      String id = input.ask("Введите ID");
      String name = this.input.ask("Введите новое имя заявки :");
      String desc = this.input.ask("Введите новое описание заявки :");
      if (tracker.replace(id, new Item(name, desc))) {
        System.out.println("------------ ITEM успешно отредактирован --------------");
        System.out.println(" ");
      } else {
        System.out.println("------------ ITEM не найден--------------");
        System.out.println(" ");
      }

    }
  }

  public void deleteItem() {
    if (tracker.lengthItems() < 1) {
      System.out.println("------------ Список ITEM пуст --------------");
      System.out.println(" ");
    } else {
      System.out.println("------------ Начинаем удаление ITEM --------------");
      String id = input.ask("Введите ID для поиска ITEM");
      tracker.delete(id);
      System.out.printf("------------ ITEM по ID: %s  удалено--------------", id);
      System.out.println(" ");
    }
  }

  public void findById() {

    if (tracker.lengthItems() < 1) {
      System.out.println("------------ Список ITEM пуст --------------");
      System.out.println(" ");
    } else {
      System.out.println("------------ Начинаем поиск  ITEM по id--------------");
      String id = input.ask("Введите ID для поиска ITEM");
      Item item = tracker.findById(id);
      if (item != null) {
        System.out.printf("------------ ITEM найден: name - %s, description - %s --------------",
            item.getName(), item.getDecs());
        System.out.println(" ");
      } else {
        System.out.println("------------ ITEM не найден--------------");
        System.out.println(" ");
      }
    }
  }

  public void findByName() {
    if (tracker.lengthItems() < 1) {
      System.out.println("------------ Список ITEM пуст --------------");
      System.out.println(" ");
    } else {
      System.out.println("------------ Начинаем поиск  ITEM по имени--------------");
      String name = input.ask("Введите имя для поиска ITEM");
      Item[] items = tracker.findByName(name);
      if (items.length < 1) {
        System.out.println("------------ ITEM не найден--------------");
      } else {
        System.out.println("------------ ITEM найден--------------");
        for (Item item : items) {
          System.out.printf("Имя: %s, описание: %s. ", item.getName(), item.getDecs());
        }
        System.out.println(" ");
      }
    }
  }

  public void exitProg() {
    System.out.println("------------ Прогармма завершает свою работу --------------");
  }

  private void showMenu() {
    System.out.println("0. Add new Item");
    System.out.println("1. Show all items");
    System.out.println("2. Edit item");
    System.out.println("3. Delete item");
    System.out.println("4. Find item by Id");
    System.out.println("5. Find items by name");
    System.out.println("6. Exit Program");
  }

  public void init() {
    boolean exit = false;
    while (!exit) {
      this.showMenu();
      String answer = this.input.ask("Введите пункт меню :");
      if (ADD.equals(answer)) {
        this.createItem();
      } else if (SHOWALL.equals(answer)) {
        this.showAllItem();
      } else if (EDIT.equals(answer)) {
        this.editItem();
      } else if (DELETE.equals(answer)) {
        this.deleteItem();
      } else if (FINDID.equals(answer)) {
        this.findById();
      } else if (FINDNAME.equals(answer)) {
        this.findByName();
      } else if (EXIT.equals(answer)) {
        this.exitProg();
        exit = true;
      } else {
        System.out.println("Неверный ввод - повторите");
      }
    }
  }
}
