package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByValue {

	public static void main(String[] args) {

		List<Product> products = Arrays.asList(new Product("Electronics", 100.0), new Product("Clothing", 50.0),
				new Product("Electronics", 155.0), new Product("Clothing", 30.0), new Product("Aesthetic", 3930.0));

		Map<String, Double> map = products.stream()
				.collect(Collectors.groupingBy(Product::getCategory, Collectors.summingDouble(Product::getPrice)));

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

}
