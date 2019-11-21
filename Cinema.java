import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        double profit = 0.00;
        int seats = rows * columns;

        switch (projection) {
            case "Premiere":
                profit = seats * 12;
                break;
            case "Normal":
                profit = seats * 7.5;
                break;
            case "Discount":
                profit = seats * 5;
                break;
        }
        System.out.printf("%.2f leva", profit);
    }
}
