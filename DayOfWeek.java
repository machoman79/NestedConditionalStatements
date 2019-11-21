import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        String day = "";

        if (number == 1) {
            day = "Monday";
        } else if (number == 2) {
            day = "Tuesday";
        } else if (number == 3) {
            day = "Wednesday";
        } else if (number == 4) {
            day = "Thursday";
        } else if (number == 5) {
            day = "Friday";
        } else if (number == 6) {
            day = "Saturday";
        } else if (number == 7) {
            day = "Sunday";
        } else {
            day = "Error";
        }
        System.out.println(day);
    }
}
