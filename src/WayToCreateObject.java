import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

public class WayToCreateObject {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		Testing123 t1 = new Testing123();
		System.out.println(t1.hashCode());
		
		
		Testing123 t2 = (Testing123) Class.forName("Testing123").newInstance();
		System.out.println(t2.hashCode());
		
		Testing123 t3 = t1;
		System.out.println(t3.hashCode());
		
		Testing123 t4 = Testing123.class.getConstructor().newInstance();
		System.out.println(t4);
		

	}
}

class Testing123 implements Serializable{


}