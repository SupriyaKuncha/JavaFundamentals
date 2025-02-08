package Collections;

import java.util.Comparator;

public class ComparingNamePrice implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		int nameComparision = p2.prodName.compareTo(p1.prodName);
		if(nameComparision == 0) {
			
			return Double.compare(p2.productPrice, p1.productPrice);
		}
		return nameComparision;
		
	}

}
