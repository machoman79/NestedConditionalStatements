import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        char genderChar = gender.charAt(0);

        if (age < 16 && 'f' == genderChar) {
            System.out.println("Miss");
        } else if (age < 16 && 'm' == genderChar) {
            System.out.println("Master");
        } else if (age >= 16 && 'f' == genderChar) {
            System.out.println("Ms.");
        } else if (age >= 16 && 'm' == genderChar) {
            System.out.println("Mr.");
        }
    }
}