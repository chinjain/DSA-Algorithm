
public class NestedInterface {
	
	public static void main(String[] args) {
		Test.nested t1 = new Testing();
		t1.show();
	}

}

class Test {
	interface nested{
		void show();
	}
}

class Testing implements Test.nested{

	@Override
	public void show() {
		System.out.println("Testing.show()");
		
	}
	
}
