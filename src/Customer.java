import java.util.ArrayList;

public class Customer {
    String name;
    Long phoneNumber;
    ArrayList<Integer> trList = new ArrayList<>();

    public Customer(String name, Long phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;

    }
}
