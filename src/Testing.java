import java.util.ArrayList;
import java.util.List;

public class Testing {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int c = 0;
		int x = (++a + b--) * c++;
		int y = (++a + b--) * ++c;
		System.err.println(x + " " + y);
//		List<String> list = new ArrayList();
//		list.add("firs");
		
		if(true) {
			break;
		}
	}

	public void m1() {

	}

	protected void getMarks() {
		Testing testing = new Testing();
		testing.m1();
	}

}
