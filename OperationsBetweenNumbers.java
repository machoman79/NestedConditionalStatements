import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        int resultPlusMinusMultp = 0;

        if (operator.equals("+") || operator.equals("-") || operator.equals("*")) {
            switch (operator) {
                case "+":
                    resultPlusMinusMultp = n1 + n2;
                    break;
                case "-":
                    resultPlusMinusMultp = n1 - n2;
                    break;
                case "*":
                    resultPlusMinusMultp = n1 * n2;
                    break;
            }
            if (resultPlusMinusMultp % 2 == 0) {
                System.out.printf("%d %s %d = %d - even", n1, operator, n2, resultPlusMinusMultp);
            } else if (resultPlusMinusMultp % 2 == 1) {
                System.out.printf("%d %s %d = %d - odd", n1, operator, n2, resultPlusMinusMultp);
            }
        }
        if (operator.equals("/")) {
            if (n2 == 0) {
                System.out.printf("Cannot divide %d by zero", n1);
            } else {
                double resultRest = (double) n1 / n2;
                System.out.printf("%d %s %d = %.2f", n1, operator, n2, resultRest);
            }
        } else if (operator.equals("%")) {
            if (n2 == 0) {
                System.out.printf("Cannot divide %d by zero", n1);
            } else {
                int resultRest1 = n1 % n2;
                System.out.printf("%d %s %d = %d", n1, operator, n2, resultRest1);
            }
        }
    }
}


