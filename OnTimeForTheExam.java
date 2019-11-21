import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourExam = Integer.parseInt(scanner.nextLine());
        int minuteExam = Integer.parseInt(scanner.nextLine());
        int hourArrive = Integer.parseInt(scanner.nextLine());
        int minuteArrive = Integer.parseInt(scanner.nextLine());

        int totalExam = hourExam * 60 + minuteExam;
        int totalArrive = hourArrive * 60 + minuteArrive;
        int diff = totalArrive - totalExam;

        if (totalArrive > totalExam) {
            System.out.println("Late");
            if (diff < 60) {
                System.out.printf("%d minutes after the start", diff);
            } else {
                int hoursDiff = diff / 60;
                int minutesDiff = diff % 60;
                System.out.printf("%d:%02d hours after the start", hoursDiff, minutesDiff);
            }
        }
        if (totalArrive == totalExam) {
            System.out.println("On time");
        }
        if (totalArrive < totalExam) {
            if (diff >= -30) {
                System.out.println("On time");
                System.out.printf("%d minutes before the start", Math.abs(diff));
            } else if (diff > -60) {
                System.out.println("Early");
                System.out.printf("%d minutes before the start", Math.abs(diff));
            } else {
                int hoursDiff = Math.abs(diff / 60);
                int minutesDiff = Math.abs(diff % 60);
                System.out.println("Early");
                System.out.printf("%d:%02d hours before the start", hoursDiff, minutesDiff);
            }
        }
    }
}
