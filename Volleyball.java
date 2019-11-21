import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        double holidays = Integer.parseInt(scanner.nextLine());
        double weekendsAway = Integer.parseInt(scanner.nextLine());

        double weekendsSofia = (48 - weekendsAway) * 3 / 4;
        double holidaysPlay = holidays * 2 / 3;

        double total = weekendsSofia + holidaysPlay + weekendsAway;
        if ("leap".equals(year)) {
            System.out.println(Math.floor(total * 1.15));
        } else {
            System.out.println(Math.floor(total));
        }
    }
}
