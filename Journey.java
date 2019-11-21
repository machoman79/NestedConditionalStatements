import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination = "";
        String place = "";
        double cost = 0.0;

        if (budget <= 100) {
            destination = "Bulgaria";
            if ("summer".equals(season)) {
                place = "Camp";
                cost = budget * 0.3;
            } else if ("winter".equals(season)) {
                place = "Hotel";
                cost = budget * 0.7;
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if ("summer".equals(season)) {
                place = "Camp";
                cost = budget * 0.4;
            } else if ("winter".equals(season)) {
                place = "Hotel";
                cost = budget * 0.8;
            }
        } else {
            destination = "Europe";
            cost = budget * 0.9;
            place = "Hotel";
        }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", place, cost);
    }
}
