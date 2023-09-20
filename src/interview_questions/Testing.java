package interview_questions;

interface Testing {

	int a = 10;

	Integer integer = 20;

	void hello();

	void print();

}

class Impl implements Testing {
	
	public static void main(String[] args) {
		
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		
		System.out.println(Testing.integer + 6);

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub

	}

}

abstract class Impl2 implements Testing {

}