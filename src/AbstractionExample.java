
public class AbstractionExample {

	public static void main(String[] args) {

		Shape circle = new Circle("Red", 2);

		System.out.println(circle.area());

	}

}

/*
 * 
 * 1. abstract class ->
 * 
 * abstract method -> whitout body only the defination of the method
 */

abstract class Shape {

	String color;

	abstract public double area();

	public Shape(String color) {
		System.out.println("Shape constructor called with Color : " + color);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

}

class Circle extends Shape {

	double radius;

	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;

	}

	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

}

class Rect extends Shape {
	double l;

	public Rect(String color, double l) {
		super(color);
		this.l = l;

	}

	@Override
	public double area() {

		return 0;
	}

}

interface Shape2 {

	public double CircleShape();
}
