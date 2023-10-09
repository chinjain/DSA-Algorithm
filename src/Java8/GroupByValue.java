package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByValue {

	public static void main(String[] args) {

		List<Product> products = Arrays.asList(new Product("Electronics", 100.0), new Product("Clothing", 50.0),
				new Product("Electronics", 155.0), new Product("Clothing", 30.0), new Product("Aesthetic", 3930.0),
				new Product("nothing", 155.0));

		Map<String, Double> map = products.stream()
				.collect(Collectors.groupingBy(Product::getCategory, Collectors.averagingDouble(Product::getPrice)));

//		Collectors.summingDouble(Product::getPrice)
		Map<Double, List<Product>> groupMap = products.stream().collect(Collectors.groupingBy(pro -> pro.getPrice()));
		System.out.println("Group By Map ->  " +  groupMap);
		System.err.println("Value of MAP is : " + map);
	}

}

class Product {

	private String category;
	private double price;

	public Product(String category, double price) {
		super();
		this.category = category;
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [category=" + category + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
	
	
	

}
