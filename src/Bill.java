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
                case 1:
                    generateBill(food);
                    break;
                case 2:
                    viewTransaction();
                    break;
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

    static void generateBill(FoodItems food){
        System.out.println("Enter your name: ");
        String name = scanner.next();
        System.out.println("Enter your phone number: ");
        long phoneNumber = scanner.nextLong();
        Customer customer = new Customer(name,phoneNumber);
        System.out.println("Enter details>>");
        System.out.print("Tea: ");
        int noOfTea = scanner.nextInt();
        System.out.print("Coffee: ");
        int noOfCoffee = scanner.nextInt();
        System.out.print("Snacks:");
        int noOfSnacks = scanner.nextInt();
        System.out.print("Idli: ");
        int noOfIdlis = scanner.nextInt();
        System.out.print("Dosa: ");
        int noOfDosa = scanner.nextInt();
        int total = noOfTea * food.tea +
                noOfCoffee * food.coffee +
                noOfSnacks * food.snacks +
                noOfIdlis * food.idli +
                noOfDosa * food.dosa;
        System.out.println("Total amount = " + total);
        customer.trList.add(total);
        list.put(customer,customer.trList);

    }

    static void viewTransaction() {
        System.out.println("Enter your name: ");
        String name = scanner.next();
        System.out.println("Enter your phone number: ");
        long phoneNumber = scanner.nextLong();
        Customer customer = new Customer(name, phoneNumber);
        for (Map.Entry<Customer, ArrayList> entry : list.entrySet()) {
            String nam = entry.getKey().name;
            Long phone = entry.getKey().phoneNumber;
            if(nam.equals(name) && phoneNumber==phone) {
                System.out.println("Transaction #" + customer.count++ + " Rs. " + entry.getValue());
            }
            else {
                System.out.println("User not found.\n Please try again");
            }

        }
    }



}
