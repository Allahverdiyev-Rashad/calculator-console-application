package util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorUtil {

    public static void calculate() {

        Scanner sc = new Scanner(System.in);
        showOperations();
        int operation = sc.nextInt();

        double result;
        if (operation < 6) {
            System.out.print(Color.YELLOW + "Birinci ədədi daxil edin : ");
            BigDecimal num1 = sc.nextBigDecimal();

            System.out.print("İkinci ədədi daxil edin : " + Color.RESET);
            BigDecimal num2 = sc.nextBigDecimal();

            if (operation == 1) {
                result = MathUtil.add(num1, num2).doubleValue();
                printResult(num1, num2, '+', result);
                //doYouWantToContinue();
            } else if (operation == 2) {
                result = MathUtil.substract(num1, num2).doubleValue();
                printResult(num1, num2, '-', result);
                //doYouWantToContinue();
            } else if (operation == 3) {
                result = MathUtil.multiply(num1, num2).doubleValue();
                printResult(num1, num2, '*', result);
                //doYouWantToContinue();
            } else if (operation == 4) {
                result = MathUtil.divide(num1, num2).doubleValue();
                printResult(num1, num2, '/', result);
                //doYouWantToContinue();
            } else if (operation == 5) {
                result = MathUtil.pow(num1.doubleValue(), num2.doubleValue());
                printResult(num1.doubleValue(), num2.doubleValue(), '^', result);
                //doYouWantToContinue();
            }
        } else if (operation == 6) {
            System.out.print("Ədədi daxil edin : ");
            double num = sc.nextDouble();
            result = MathUtil.squareRoot(num);
            printResult(num, '√', result);
            //doYouWantToContinue();
        } else if (operation == 7) {
            System.exit(1);
        } else {
            System.out.println(Color.RED + "Belə əməliyyat yoxdur.\n" + "Zəhmət olmasa yenidən seçim edin\n" + Color.RESET);
        }

    }

    public static void showOperations() {
        System.out.println(Color.BLUE + "Yerinə yetirmək istədiyiniz əməliyyatı seçin :\n"
                + Color.RESET + Color.PURPLE
                + "1.Toplama\n"
                + "2.Çıxma\n"
                + "3.Vurma\n"
                + "4.Bölmə\n"
                + "5.Qüvvətə yüksəltmə\n"
                + "6.Kökaltı\n"
                + "7.Çıxış\n" + Color.RESET
        );
    }

    public static void printResult(BigDecimal num1, BigDecimal num2,
                                   char operator, double result) {

        DecimalFormat format = new DecimalFormat("0.##########");

        System.out.println(format.format(num1) + " "
                + operator + " "
                + format.format(num2) + " = "
                + format.format(result));
    }

    public static void printResult(double num1, double num2,
                                   char operator, double result) {

        DecimalFormat format = new DecimalFormat("0.##########");

        System.out.println(format.format(num1) + " "
                + operator + " "
                + format.format(num2) + " = "
                + format.format(result));
    }

    public static void printResult(double num, char operator,
                                   double result) {

        DecimalFormat format = new DecimalFormat("0.##########");

        System.out.println(operator + format.format(num)
                + " = " + format.format(result));
    }

/*   public static void doYouWantToContinue() {
        System.out.println("Davam etmək istəyirsinizmi\n" + "1.Bəli\n2.Xeyr");
        if (new Scanner(System.in).nextInt() == 1) {
            CalculatorUtil.calculate();
        } else {
            System.exit(1);
        }
    }
    */

}
