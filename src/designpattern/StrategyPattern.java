package designpattern;

/*
 * The Strategy Design Pattern is a behavioral design pattern in Java that defines a family of algorithms, 
 * encapsulates each one of them, and makes them interchangeable. 
 * It allows a client to choose an algorithm from a family of algorithms at runtime. 
 * This pattern promotes the "Open/Closed Principle" by allowing you to add new algorithms without modifying the 
   existing code that uses these algorithms.


	Here's how you can implement the Strategy Design Pattern in Java:
 */

interface PaymentStrategy {
	void pay(int amount);
}

class CreditCardPayment implements PaymentStrategy {

	private String cardNumber;
	private String name;

	public CreditCardPayment(String cardNumber, String name) {
		this.cardNumber = cardNumber;
		this.name = name;
	}

	@Override
	public void pay(int amount) {
		System.out.println("Paid " + amount + " using credit card.");
	}

}

class PayPalPayment implements PaymentStrategy {
	private String email;

	public PayPalPayment(String email) {
		this.email = email;
	}

	@Override
	public void pay(int amount) {
		System.out.println("Paid " + amount + " using PayPal.");

	}

}

// This one is the context class which will help us to decide what kind of payment we need at the time of checkout 
class ShoppingCart {
	private PaymentStrategy strategy;

	public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
		this.strategy = paymentStrategy;
	}

	public void checkout(int amt) {
		strategy.pay(amt);
	}
}

public class StrategyPattern {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();

		cart.setPaymentStrategy(new PayPalPayment("chinmayjain03@gmail.com"));
		cart.checkout(50003);

		cart.setPaymentStrategy(new CreditCardPayment("5555-0922-2201-2122", "Chinmay Jain"));
		cart.checkout(23000);
	}

}
