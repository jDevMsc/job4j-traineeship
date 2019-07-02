package ru.job4j.calculator;

/**
 * Calculator.
 * @author Artem Luzan(artemmoscowpro@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Calculator {
    /**
     * Method add.
     * @param first First numeral.
     * @param second Second numeral.
     * @return First numeral plus Second numeral.
     */
    public double add(double first, double second) {
        return first + second;
    }
    /**
     * Method subtract.
     * @param first First numeral.
     * @param second Second numeral.
     * @return First numeral subtract Second numeral.
     */
    public double subtract(double first, double second) {
        return first - second;
    }
    /**
     * Method div.
     * @param first First numeral.
     * @param second Second numeral.
     * @return First numeral div Second numeral.
     */
    public double div(double first, double second) {
        return first / second;
    }
    /**
     * Method multiple.
     * @param first First numeral.
     * @param second Second numeral.
     * @return First numeral multiple Second numeral.
     */
    public double multiple(double first, double second) {
        return first * second;
    }

}