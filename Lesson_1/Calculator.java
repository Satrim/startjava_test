public class Calculator {
    public static void main (String[] args) {
        double number1 = 10;
        double number2 = 3;
        char mathOperation = '+';
        double result = 0;

        if (mathOperation == '+') {
            result = number1 + number2;
        } else if (mathOperation == '-') {
            result = number1 - number2;
        } else if (mathOperation == '*') {
            result = number1 * number2;
        } else if (mathOperation == '/') {
            result = number1 / number2;
        } else if (mathOperation == '%') {
            result = number1 % number2;
        } else if (mathOperation == '^') {
            result = 1;
            for (int i = 0; i < number2; i ++) {
                result = result * number1;
            }
        }
        System.out.println(result);
    }
}