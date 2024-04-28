package designpattern;

public class Factory_design_Pattern {

	/*
	 * 
	 * Based on the input we will create the object of the child classes
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		Employee emp = DeveloperFactory.getInstance("ANDROID");
		System.err.println(emp.getSalary());

	}

}

interface Employee {

	int getSalary();

}

class AndroidDev implements Employee {

	@Override
	public int getSalary() {
		System.out.println("AndroidDev.getSalary()");
		return 9843745;
	}

}

class WebDeveloper implements Employee {

	@Override
	public int getSalary() {
		System.out.println("WebDeveloper.getSalary()");
		return 120389284;
	}

}

class DeveloperFactory {

	public static Employee getInstance(String type) {

		if (type.trim().equals("ANDROID")) {
			return new AndroidDev();
		}else {
			return new WebDeveloper();
		}

	}

}
