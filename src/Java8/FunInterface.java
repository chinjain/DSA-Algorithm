package Java8;

public class FunInterface implements Demo {

	public static void main(String[] args) {
		FunInterface funInterface = new FunInterface();
		funInterface.defme();
	}
	
	@Override
	public void hello() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void defme() {
		Demo.super.defme();
	}

}

@FunctionalInterface
interface Demo {

	public void hello();

	public static void demoPrint() {
		System.out.println("Hey this is static");
	}
	
	default void defme() {
		System.out.println("Hey There");
	}

}
