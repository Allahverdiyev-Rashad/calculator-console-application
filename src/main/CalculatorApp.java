package main;

import util.CalculatorUtil;
import util.Color;

public class CalculatorApp {

    public static void main(String[] args) {

        while (true) {
            try {
                CalculatorUtil.calculate();
            } catch (ArithmeticException e) {
                System.out.println(Color.RED +
                        "\nXəta baş verdi!!!\nDüzgün olmayan riyazi əməliyyat"
                        + Color.RESET + "\n");
            } catch (Exception ex) {
                System.out.println(Color.RED +
                        "\nXəta baş verdi!!!\nXahiş olunur daxiletmə zamanı yalnız rəqəmlərdən istifadə edin"
                        + Color.RESET + "\n");
            }
        }
    }
}
