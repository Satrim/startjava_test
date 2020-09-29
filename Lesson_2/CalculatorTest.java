import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scan = new Scanner(System.in,  "Cp866");
        boolean isEnd = false;

        while (!isEnd) {
            System.out.print("Введите первое число: ");
            calculator.setFirstNumber(scan.nextInt());
            System.out.print("Введите знак математической операции: ");
            calculator.setMathOperation(scan.next().charAt(0));
            System.out.print("Введите второе число: ");
            calculator.setSecondNumber(scan.nextInt());
            System.out.println(calculator.getResult());

            while (true) {
                System.out.print("Хотите продолжить? [да/нет]: ");
                String reply = scan.next();
                System.out.println(reply);
                if (reply.equals("да")) {
                    break;
                }
                if (reply.equals("нет")) {
                    isEnd = true;
                    break;
                }
            }
        }
    }
}