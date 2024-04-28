
public class ObjectCount {

	static int count = 0;

	public ObjectCount() {
		count++;
	}

	public static void main(String[] args) {

		ObjectCount o1 = new ObjectCount();
		ObjectCount o2 = new ObjectCount();
		ObjectCount o3 = new ObjectCount();
		
		System.out.println(count);

	}

}
