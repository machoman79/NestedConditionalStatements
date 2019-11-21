import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double studio = 0.00;
        double apartment = 0.00;

        if ("May".equals(month) || "October".equals(month)) {
            studio = 50 * nights;
            apartment = 65 * nights;
            if (nights > 14) {
                studio *= 0.7;
            } else if (nights > 7) {
                studio *= 0.95;
            }
            if (nights > 14) {
                apartment *= 0.9;
            }
        } else if ("June".equals(month) || "September".equals(month)) {
            studio = 75.20 * nights;
            apartment = 68.70 * nights;
            if (nights > 14) {
                studio *= 0.8;
            }
            if (nights > 14) {
                apartment *= 0.9;
            }
        } else if ("July".equals(month) || "August".equals(month)) {
            studio = 76 * nights;
            apartment = 77 * nights;
            if (nights > 14) {
                apartment *= 0.9;
            }
        }
        System.out.printf("Apartment: %.2f lv.%n", apartment);
        System.out.printf("Studio: %.2f lv.", studio);
    }
}
