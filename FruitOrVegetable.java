import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item = scanner.nextLine();

        if ("banana".equals(item)
                || "apple".equals(item)
                || "kiwi".equals(item)
                || "cherry".equals(item)
                || "lemon".equals(item)
                || "grapes".equals(item)) {
            System.out.println("fruit");
        } else if ("tomato".equals(item)
                || "cucumber".equals(item)
                || "pepper".equals(item)
                || "carrot".equals(item)) {
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }
    }
}