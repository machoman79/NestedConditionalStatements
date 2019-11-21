import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double percentage = 0.00;

        if (sales > 10000) {
            if ("Sofia".equals(town)) {
                percentage = 0.12;
            } else if ("Varna".equals(town)) {
                percentage = 0.13;
            } else if ("Plovdiv".equals(town)) {
                percentage = 0.145;
            }
        } else if (sales > 1000) {
            if ("Sofia".equals(town)) {
                percentage = 0.08;
            } else if ("Varna".equals(town)) {
                percentage = 0.10;
            } else if ("Plovdiv".equals(town)) {
                percentage = 0.12;
            }
        } else if (sales > 500) {
            if ("Sofia".equals(town)) {
                percentage = 0.07;
            } else if ("Varna".equals(town)) {
                percentage = 0.075;
            } else if ("Plovdiv".equals(town)) {
                percentage = 0.08;
            }
        } else if (sales >= 0) {
            if ("Sofia".equals(town)) {
                percentage = 0.05;
            } else if ("Varna".equals(town)) {
                percentage = 0.045;
            } else if ("Plovdiv".equals(town)) {
                percentage = 0.055;
            }
        }
        if (percentage != 0) {
            percentage *= sales;
            System.out.printf("%.2f", percentage);
        } else {
            System.out.println("error");
        }
    }
}