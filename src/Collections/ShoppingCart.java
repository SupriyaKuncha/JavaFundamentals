package Collections;
 
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;
 
public class ShoppingCart {
 

    private Deque<Product> cart = new ArrayDeque<>();
    private Map<Integer, Product> cart1 = new HashMap<>();
    private Map<Integer, Product> cart2 = new LinkedHashMap<>();
    private Map<Integer, Product> cart3 = new TreeMap<>();
    
    
    private TreeSet<Product> cart4;
    
private Scanner scanner = new Scanner(System.in);
 
    // Add product to cart
    public void addProduct() {
        System.out.println("Enter product ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the product name: ");
        String name = scanner.nextLine();
        System.out.println("Enter product price");
        double price = scanner.nextDouble();
        System.out.println("Which category it belongs to: ");
        String category = scanner.next();
        
        // Add the new product to the deque.
//        cart.add(new Product(id, name, price, category));
        Product newProd = new Product(id, name, price, category);
        //using Linkedhashmap
        cart3.put(id, newProd);

        System.out.println("Product: " + name + " added to the cart");
    }
 
    // Remove a product from cart
    public void removeProduct() {
        System.out.println("Enter product ID to remove: ");
        int id = scanner.nextInt();
       
//        boolean removed = cart.removeIf(product -> product.prodId == id);

        if (cart3.remove(id) != null) {
            System.out.println("Product with ID " + id + " is removed from cart");
        } else {
            System.out.println("Product with ID " + id + " is not found");
        }
    }
 
    // Search for a product by name
    public void searchProduct() {
        System.out.println("Enter product name to search in the cart: ");
        String name = scanner.next();
        for (Product product : cart3.values()) {
            if (product.prodName.equalsIgnoreCase(name)) {
                System.out.println("Product name found");
                return;
            }
        }
        System.out.println("Product not found");
    }
 
    // Calculate discount based on category
    public double discount(String category) {
        if (category.equalsIgnoreCase("electronics")) {
            System.out.println("10% discount applied!");
            return 0.10;
        } else if (category.equalsIgnoreCase("groceries")) {
            System.out.println("1% discount applied!");
            return 0.01;
        } else {
            System.out.println("No discount applied!");
            return 0;
        }
    }
 
    // Checkout: apply discounts and calculate the total bill
    public void checkOut() {
        double totalBill = 0;
        // Polling from ArrayDeque until it is empty.
        while (!cart3.values().isEmpty()) {
            Product prod = cart.poll();
            
            System.out.println("Discount applied on: " + prod.prodName);
            double discountValue = discount(prod.category);
            totalBill += prod.productPrice;
            totalBill -= prod.productPrice * discountValue;
        }
        System.out.println("Total price to be paid: " + totalBill);
        // The cart is now empty.
        System.out.println("Check out complete. Cart is empty");
    }
 
    // Display products in the cart
    public void displayProducts() {
        if (cart3.isEmpty()) {
            System.out.println("No items to display");
        } else {
            for (Product product : cart3.values()) {
                System.out.println(product);
            }
        }
    }
 
    // Choose the type of comparison for sorting (using TreeSet)
    public void chooseComparision() {
        System.out.println("Press 1: To Sort by name and then price");
        System.out.println("Press 2: To Sort by category and then price");
        System.out.println("Press 3: To Sort by category and then Id");
        System.out.println("Press 4: Exit");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                cart4 = new TreeSet<>(new ComparingNamePrice());
                break;
            case 2:
                cart4 = new TreeSet<>(new ComparingCategoryPrice());
                break;
            case 3:
                cart4 = new TreeSet<>(new ComparingCategoryId());
                break;
            case 4:
                System.out.println("Exiting");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
 
    // Main menu
    public void menu() {
        while (true) {
            System.out.println("------------------------------------------");
            System.out.println("**** Shopping Cart ****");
            System.out.println("Press 1: To Add product");
            System.out.println("Press 2: To remove product");
            System.out.println("Press 3: To display Product");
            System.out.println("Press 4: To Search product");
            System.out.println("Press 5: To checkout");
            System.out.println("Press 6: To exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    removeProduct();
                    break;
                case 3:
                    displayProducts();
                    break;
                case 4:
                    searchProduct();
                    break;
                case 5:
                    checkOut();
                    break;
                case 6:
                    System.out.println("Exiting..");
                    return; // Exit the loop and end the program.
                default:
                    System.out.println("Invalid option");
            }
        }
    }
 
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        
//         cart.chooseComparision();
        cart.menu();
    }
}
