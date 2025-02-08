package JavaBasics;
import java.util.Scanner;
public class OrderManagement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
        System.out.println("Enter the number of items:");
        int Items = scanner.nextInt();
 
        double[] prices = new double[Items];
        int[] quantities = new int[Items];
 
        System.out.println("Enter the list of items (price, quantity):");
        for (int i = 0; i < Items; i++) {
            prices[i] = scanner.nextDouble();
            quantities[i] = scanner.nextInt();
        }
 
        double originalTotalCost = TotalCost(prices, quantities);
        double discountedCost = applyDiscount(originalTotalCost);
        double shippingCost = Shipping(discountedCost);
        double finalCost = discountedCost + shippingCost;
 
        System.out.println("\n--- Bill ---");
        System.out.printf("Original Cost: ₹%.2f\n", originalTotalCost);
        System.out.printf("Discount Amount: ₹%.2f\n", originalTotalCost - discountedCost);
        System.out.printf("Discounted Cost: ₹%.2f\n", discountedCost);
        System.out.printf("Shipping Cost: ₹%.2f\n", shippingCost);
        System.out.printf("Final Cost: ₹%.2f\n", finalCost);
 
        scanner.close();
    }
 
    static double TotalCost(double[] prices, int[] quantities) {
        double totalCost = 0;
        for (int i = 0; i < prices.length; i++) {
            totalCost += prices[i] * quantities[i];
        }
        return totalCost;
    }
 
    static double applyDiscount(double cost) {
        if (cost >= 5000 && cost <= 10000) {
            return cost * 0.9; // 10% discount
        } else if (cost > 10000) {
            return cost * 0.8; // 20% discount
        } else {
            return cost; // No discount
        }
    }
 
    static double Shipping(double discountedCost) {
        return discountedCost >= 7500 ? 0 : 250;


	}

}
