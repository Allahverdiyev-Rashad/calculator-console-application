package util;

import java.math.BigDecimal;

public class MathUtil {

    public static BigDecimal add(BigDecimal num1, BigDecimal num2) {
        return num1.add(num2);
    }

    public static BigDecimal substract(BigDecimal num1, BigDecimal num2) {
        return num1.subtract(num2);
    }

    public static BigDecimal multiply(BigDecimal num1, BigDecimal num2) {
        return num1.multiply(num2);
    }

    public static BigDecimal divide(BigDecimal num1, BigDecimal num2) {
        return num1.divide(num2);
    }

    public static double pow(double num1, double num2) {
        return Math.pow(num1, num2);
    }

    public static double squareRoot(double num) {
        return Math.sqrt(num);
    }


}
