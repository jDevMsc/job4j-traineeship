package ru.job4j.loop;
/**
 * Программа по накачке.[#154561]
 * @author Artem Luzan(artemmoscowpro@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Fitness {
    /**
     * Программа по накачке мышц за определенное кол-во месяцев.
     * @param ivan тяга Ивана.
     * @param nik тяга Николая.
     * @return кол-во месяцев.
     */
    public int calc(int ivan, int nik) {
        int month = 0;
        while (ivan < nik) {
            month++;
            ivan *= 3;
            nik *= 2;
        }
        return month;
    }
}