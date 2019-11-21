import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0;

        if ("coffee".equals(product) && "Sofia".equals(town)) {
            price = 0.50;
        } else if ("coffee".equals(product) && "Plovdiv".equals(town)) {
            price = 0.40;
        } else if ("coffee".equals(product) && "Varna".equals(town)) {
            price = 0.45;
        }

        if ("water".equals(product) && "Sofia".equals(town)) {
            price = 0.80;
        } else if ("water".equals(product) && "Plovdiv".equals(town)) {
            price = 0.70;
        } else if ("water".equals(product) && "Varna".equals(town)) {
            price = 0.70;
        }

        if ("beer".equals(product) && "Sofia".equals(town)) {
            price = 1.20;
        } else if ("beer".equals(product) && "Plovdiv".equals(town)) {
            price = 1.15;
        } else if ("beer".equals(product) && "Varna".equals(town)) {
            price = 1.10;
        }

        if ("sweets".equals(product) && "Sofia".equals(town)) {
            price = 1.45;
        } else if ("sweets".equals(product) && "Plovdiv".equals(town)) {
            price = 1.30;
        } else if ("sweets".equals(product) && "Varna".equals(town)) {
            price = 1.35;
        }

        if ("peanuts".equals(product) && "Sofia".equals(town)) {
            price = 1.60;
        } else if ("peanuts".equals(product) && "Plovdiv".equals(town)) {
            price = 1.50;
        } else if ("peanuts".equals(product) && "Varna".equals(town)) {
            price = 1.55;
        }
        double cost = price * quantity;
        System.out.println(cost);
    }
}

