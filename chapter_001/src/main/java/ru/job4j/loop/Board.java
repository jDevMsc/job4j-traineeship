package ru.job4j.loop;

/**
 * Построить шахматную доску в псевдографике.[#154564]
 * @author Artem Luzan(artemmoscowpro@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Board {
    /**
     * Рисуем шахматную доску.
     * @param width ширина доски.
     * @param height высота доски.
     * @return шахматная доска.
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // условие проверки, что писать пробел или X
                // Выше в задании мы определили закономерность, когда нужно проставлять X
                if (j % 2 == 0 && i % 2 == 0) {
                    screen.append("X");
                } else if (i % 2 != 0 && j % 2 != 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод на новую строку.
            screen.append(ln);
        }
        return screen.toString();
    }
}
