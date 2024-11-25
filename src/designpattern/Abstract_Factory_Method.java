package designpattern;

public class Abstract_Factory_Method {

	/*
	 * 1. Also known as Factory method design pattern
	 * 
	 * 2. Here employee factory also don't know about the how he is going to create
	 * the project
	 * 
	 * 3. Employee factory calls the abstract factory then it will call another
	 * abstract factory and finally you will get the object
	 * 
	 * 4. here we add the extra layer to get the object 
	 */

	public static void main(String[] args) {

		Emp e1 = FactoryEmployee.getEmployee(new AndroidFactory());

		System.out.println(e1.salary());
		
		Emp e2 = FactoryEmployee.getEmployee(new ManagerFactory());
		System.out.println(e2.name());

	}

}

interface Emp {
	int salary();

	String name();
}

class AnddDev implements Emp {

	@Override
	public int salary() {
		// TODO Auto-generated method stub
		return 50000;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Android Developer Bro..";
	}

}

class WebDev implements Emp {

	@Override
	public int salary() {
		// TODO Auto-generated method stub
		return 45000;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Web developer Broo....";
	}

}

abstract class AbstractEmployeeFactory {

	public abstract Emp createEmployee();
}

class FactoryEmployee {

	public static Emp getEmployee(AbstractEmployeeFactory factory) {

		return factory.createEmployee();

	}
}

class AndroidFactory extends AbstractEmployeeFactory {

	@Override
	public Emp createEmployee() {
		return new AnddDev();
	}

}

class webFactory extends AbstractEmployeeFactory {

	@Override
	public Emp createEmployee() {
		return new WebDev();
	}

}

class Manager implements Emp {

	@Override
	public int salary() {
		// TODO Auto-generated method stub
		return 1500000;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "I am a manager bro";
	}

}

class ManagerFactory extends AbstractEmployeeFactory {

	@Override
	public Emp createEmployee() {
		// TODO Auto-generated method stub
		return new Manager();
	}

}
