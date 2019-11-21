import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int numFishermen = Integer.parseInt(scanner.nextLine());
        double cost = 0.00;

        switch (season) {
            case "Spring":
                cost = 3000;
                break;
            case "Summer":
            case "Autumn":
                cost = 4200;
                break;
            case "Winter":
                cost = 2600;
                break;
        }
        if (numFishermen <= 6) {
            cost *= 0.9;
        } else if (numFishermen >= 12) {
            cost *= 0.75;
        } else {
            cost *= 0.85;
        }
        if (!"Autumn".equals(season) && numFishermen % 2 == 0) {
            cost *= 0.95;
        }
        if (budget >= cost) {
            System.out.printf("Yes! You have %.2f leva left.", budget - cost);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", cost - budget);
        }
    }
}
