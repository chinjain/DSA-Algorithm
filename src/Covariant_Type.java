import java.util.concurrent.ConcurrentHashMap;

public class Covariant_Type {

	public static void main(String[] args) {
		
		ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>();

	}

}

class T1 {

	public T1 get() {
		return this;
	}
}

class T2 extends T1 {

	@Override
	// This is covariant we can specify the most specific Return type in
	// the subclasses.
	public T2 get() {
		// TODO Auto-generated method stub
		return this;
	}

}