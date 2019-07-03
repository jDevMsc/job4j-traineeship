package ru.job4j.array;

/**
 * Обертка над строкой.
 * @author Artem Luzan(artemmoscowpro@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class ArrayChar {

    /**
     * Проверяет. что слово начинается с префикса.
     * @param prefix префикс.
     * @param word слово.
     * @return если слово начинаеться с префикса
     */
    public boolean startsWith(String word, String prefix) {
        boolean result = true;
        char[] pref = prefix.toCharArray();
        char[] wrd = word.toCharArray();
        for (int i = 0; i < pref.length; i++) {
            if (pref[i] != wrd[i]) {
                result = false;
                break;
            }

        }
        return result;
    }
}