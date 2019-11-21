import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0.00;
        boolean weekdays = "Monday".equals(day)
                || "Tuesday".equals(day)
                || "Wednesday".equals(day)
                || "Thursday".equals(day)
                || "Friday".equals(day);

        boolean weekEnd = "Saturday".equals(day)
                || "Sunday".equals(day);

        if ("banana".equals(fruit)) {
            if (weekdays) {
                price = 2.50;
            } else if (weekEnd) {
                price = 2.70;
            }
        } else if ("apple".equals(fruit)) {
            if (weekdays) {
                price = 1.20;
            } else if (weekEnd) {
                price = 1.25;
            }
        } else if ("orange".equals(fruit)) {
            if (weekdays) {
                price = 0.85;
            } else if (weekEnd) {
                price = 0.90;
            }
        } else if ("grapefruit".equals(fruit)) {
            if (weekdays) {
                price = 1.45;
            } else if (weekEnd) {
                price = 1.6;
            }
        } else if ("kiwi".equals(fruit)) {
            if (weekdays) {
                price = 2.70;
            } else if (weekEnd) {
                price = 3.00;
            }
        } else if ("pineapple".equals(fruit)) {
            if (weekdays) {
                price = 5.50;
            } else if (weekEnd) {
                price = 5.60;
            }
        } else if ("grapes".equals(fruit)) {
            if (weekdays) {
                price = 3.85;
            } else if (weekEnd) {
                price = 4.20;
            }
        }
        if (price != 0.00) {
            price *= quantity;
            System.out.printf("%.2f", price);
        } else {
            System.out.println("error");
        }
    }
}