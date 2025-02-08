package Java8Features;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> products = List.of(
				
				new Product("Laptop", "Electronics", 55000.00),
				new Product("Shoe", "Footwear", 5500.00),
				new Product("Moniter","Electronics",45000.00),
				new Product("Honey", "grocery",100.0)
				 
				);
		
		List<Product> filterProducts = products.stream()
				.filter(product->product.getPrice()>5000.00 &&product.getPrice()<50000)
				.collect(Collectors.toList());
		
		
		filterProducts.forEach(product->System.out.println(product));
		System.out.println("------------------------------");
		
		List<Product> sortedProducts = products.stream()
				.sorted(Comparator.comparingDouble(Product::getPrice))
				.collect(Collectors.toList());
		sortedProducts.forEach(product->System.out.println(product));
		
		System.out.println("------------------------------");
		
		List<String>upperCaseName = products.stream()
				.map(product->product.getName().toUpperCase())
				.collect(Collectors.toList());
		upperCaseName.forEach(product->System.out.println(product));
		System.out.println("------------------------------");
		double avgPrice = products.stream()
				.mapToDouble(Product::getPrice)
				.average()
				.orElse(0);
		System.out.println(avgPrice);
		
	}

}
