package Collections;

import java.util.Comparator;

public class ComparingCategoryId implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		int categoryComparision = p2.category.compareTo(p1.category);
		if(categoryComparision == 0) {
			
			return Double.compare(p2.prodId, p1.prodId);
		}
		return categoryComparision;

	}

}
