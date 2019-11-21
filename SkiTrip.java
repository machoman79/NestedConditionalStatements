import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine()) - 1;
        String typeRoom = scanner.nextLine();
        String rating = scanner.nextLine();
        double percentage = 0.00;

        if (days > 15) {
            if ("apartment".equals(typeRoom)) {
                percentage = 0.5;
            } else if ("president apartment".equals(typeRoom)) {
                percentage = 0.8;
            }
        } else if (days > 9) {
            if ("apartment".equals(typeRoom)) {
                percentage = 0.65;
            } else if ("president apartment".equals(typeRoom)) {
                percentage = 0.85;
            }
        } else {
            if ("apartment".equals(typeRoom)) {
                percentage = 0.7;
            } else if ("president apartment".equals(typeRoom)) {
                percentage = 0.9;
            }
        }
        double roomOnePerson = days * 18.00;
        double apartment = days * percentage * 25.00;
        double presidentialApartment = days * percentage * 35.00;

        if ("positive".equals(rating)) {
            if ("room for one person".equals(typeRoom)) {
                System.out.printf("%.2f", roomOnePerson * 1.25);
            } else if ("apartment".equals(typeRoom)) {
                System.out.printf("%.2f", apartment * 1.25);
            } else if ("president apartment".equals(typeRoom)) {
                System.out.printf("%.2f", presidentialApartment * 1.25);
            }
        } else if ("negative".equals(rating)) {
            if ("room for one person".equals(typeRoom)) {
                System.out.printf("%.2f", roomOnePerson * 0.90);
            } else if ("apartment".equals(typeRoom)) {
                System.out.printf("%.2f", apartment * 0.90);
            } else if ("president apartment".equals(typeRoom)) {
                System.out.printf("%.2f", presidentialApartment * 0.90);
            }
        }
    }
}
