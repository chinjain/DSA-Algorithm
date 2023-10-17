package designpattern;

public class BuilderPattern {

	public static void main(String[] args) {
		Product p1 = new Product.Builder().setPart1("Hello 1").build();
		
		System.out.println(p1);
	}

}

class Product {
	private String part1;
	private String part2;

	public Product() {

	}

	public void setPart1(String part1) {
		this.part1 = part1;
	}

	public void setPart2(String part2) {
		this.part2 = part2;
	}

	@Override
	public String toString() {
		return "Product [part1=" + part1 + ", part2=" + part2 + "]";
	}

	public static class Builder {
		private Product product;

		public Builder() {
			this.product = new Product();
		}

		public Builder setPart1(String part1) {
			product.setPart1(part1);
			return this;
		}

		public Builder setPart2(String part2) {
			product.part2 = part2;
			return this;
		}

		public Product build() {
			return product;
		}

	}

}