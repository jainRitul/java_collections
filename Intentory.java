import java.util.ArrayList;
import java.util.Scanner;

public class Intentory {

    static ArrayList<Item> inventory = new ArrayList<>();

    static class Item {
        int id;
        String name;
        int quantity;
        double price;

        Item(int id, String name, int quantity, double price) {
            this.id = id;
            this.name = name;
            this.quantity = quantity;
            this.price = price;
        }
    }

    public static void addItem(int id, String name, int quantity, double price) {
        Item item = new Item(id, name, quantity, price);
        inventory.add(item);
    }

    public static Item searchById(int searchId) {
        for (Item item : inventory) {
            if (item.id == searchId) {
                return item;
            }
        }
        return null;
    }

    public static Item searchByName(String searchName) {
        for (Item item : inventory) {
            if (item.name.equals(searchName)) {
                return item;
            }
        }
        return null;
    }

    public static void displayItem(Item item) {
        if (item != null) {
            System.out.println("Item ID: " + item.id);
            System.out.println("Item Name: " + item.name);
            System.out.println("Quantity: " + item.quantity);
            System.out.println("Price: " + item.price);
        } else {
            System.out.println("Item not available.");
        }
    }

    public static void main(String[] args) {
        addItem(1, "Laptop", 5, 800);
        addItem(2, "Mouse", 10, 20);
        addItem(3, "Keyboard", 8, 50);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Search by ID");
            System.out.println("2. Search by Name");
            System.out.println("3. Exit");

            System.out.print("Enter your choice (1/2/3): ");
            String choice = scanner.next();

            if (choice.equals("1")) {
                System.out.print("Enter item ID to search: ");
                int searchId = scanner.nextInt();
                Item item = searchById(searchId);
                displayItem(item);
            } else if (choice.equals("2")) {
                System.out.print("Enter item name to search: ");
                String searchName = scanner.next();
                Item item = searchByName(searchName);
                displayItem(item);
            } else if (choice.equals("3")) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }
}
