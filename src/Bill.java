import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bill {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Integer> transactionList = new ArrayList<>();
    static HashMap<Customer, ArrayList> list = new HashMap<>();
    public static void main(String[] args) {

        FoodItems food = new FoodItems();
        while (true) {
            System.out.println("""
                    1. Generate Bill
                    2. View Transactions
                    3. Exit""");
            System.out.println("Select your option:");
            int choice = scanner.nextInt();
            switch (choice) {

                case 3:
                    System.out.println("Exiting the bill system...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Try again!");
                    break;

            }
        }
    }



}
