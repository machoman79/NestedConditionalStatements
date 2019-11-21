import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int numFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double sum = 0.0;

        switch (flowers) {
            case "Roses":
                if (numFlowers > 80) {
                    sum = numFlowers * 5 * 0.9;
                } else {
                    sum = numFlowers * 5;
                }
                break;
            case "Dahlias":
                if (numFlowers > 90) {
                    sum = numFlowers * 3.8 * 0.85;
                } else {
                    sum = numFlowers * 3.8;
                }
                break;
            case "Tulips":
                if (numFlowers > 80) {
                    sum = numFlowers * 2.8 * 0.85;
                } else {
                    sum = numFlowers * 2.8;
                }
                break;
            case "Narcissus":
                if (numFlowers < 120) {
                    sum = numFlowers * 3 * 1.15;
                } else {
                    sum = numFlowers * 3;
                }
                break;
            case "Gladiolus":
                if (numFlowers < 80) {
                    sum = numFlowers * 2.5 * 1.2;
                } else {
                    sum = numFlowers * 2.5;
                }
                break;
        }
        if (budget >= sum) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numFlowers, flowers, budget - sum);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", sum - budget);
        }
    }
}
