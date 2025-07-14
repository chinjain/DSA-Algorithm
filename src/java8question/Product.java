package java8question;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class Product {

    String productId;
    String prodName;
    String category;
    int quantity;
    boolean inStock;
    double price;

    public Product( String prodName, String category, int quantity, boolean inStock, double price) {
        this.prodName = prodName;
        this.category = category;
        this.quantity = quantity;
        this.inStock = inStock;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
                new Order(1500, Arrays.asList(
                        new Product("iPhone 14", "Electronics", 10, true, 79999.99),
                        new Product("Samsung Galaxy S23", "Electronics", 5, true, 69999.49),
                        new Product("MacBook Pro", "Electronics", 3, true, 149999.00),
                        new Product("Sony Headphones", "Electronics", 8, true, 24999.99),
                        new Product("Dell XPS 15", "Electronics", 4, true, 119999.95)
                ),LocalDateTime.now().minusHours(3)),
                new Order(600, Arrays.asList(
                        new Product("Nike Air Max", "Footwear", 15, true, 8999.00),
                        new Product("Adidas Ultraboost", "Footwear", 12, true, 10499.00),
                        new Product("Levi's Jeans", "Clothing", 20, true, 2499.99),
                        new Product("Zara T-Shirt", "Clothing", 25, true, 999.49)
                ), LocalDateTime.now().minusHours(10)),
                new Order(400, Arrays.asList(
                        new Product("Woodland Boots", "Footwear", 10, true, 4999.99),
                        new Product("H&M Hoodie", "Clothing", 18, true, 1999.99),
                        new Product("Mi Smart Band", "Electronics", 30, true, 2999.00),
                        new Product("Apple Watch", "Electronics", 6, true, 28999.00),
                        new Product("Boat Airdopes", "Electronics", 40, true, 1299.00),
                        new Product("Logitech Mouse", "Electronics", 10, true, 7499.00)
                ), LocalDateTime.now().minusHours(5)),
                new Order(1000, Arrays.asList(
                        new Product("Samsung 4K TV", "Electronics", 1, true, 58999.00),
                        new Product("Casio Watch", "Accessories", 7, true, 6999.00),
                        new Product("Ray-Ban Sunglasses", "Accessories", 5, true, 6499.00),
                        new Product("Wildcraft Backpack", "Accessories", 14, true, 1999.00)
                ), LocalDateTime.now().minusHours(30))
        );


        Map<String, Integer> mapOfCategory = orders.stream()
                .filter(order ->  order.getOrderTime().isAfter(LocalDateTime.now().minusHours(24)))
                .filter(order -> order.getTotalValue() > 500)
                .flatMap(order -> order.getProducts().stream())
                .filter(product -> product.inStock)
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.summingInt(Product::getQuantity)))
                        .entrySet().stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                        (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(mapOfCategory);


    }
}

class Cart{

}

class Order{

    String orderId;
    double totalValue;
    List<Product> products;
    LocalDateTime orderTime;

    public Order( double totalValue, List<Product> products, LocalDateTime orderTime) {
        this.totalValue = totalValue;
        this.products = products;
        this.orderTime = orderTime;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }
}