package designpattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Singelton_Design_Pattern {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		// Db_Instance instance = Db_Instance.lazyInstance();
		// System.out.println(instance.hashCode());
		// Db_Instance instance2 = Db_Instance.lazyInstance();
		// System.out.println(instance2.hashCode());

		System.out.println(Db_Instance.eagerInstance().hashCode() + " " + Db_Instance.eagerInstance().hashCode());

		// Break Singelton Desing pattern

		/*
		 * 
		 * 1. Reflection API to Break 
		 * Solution If object exist we will throw the
		 * Exceptions
		 * 
		 * 
		 */

		Db_Instance db_Instance = Db_Instance.eagerInstance();
		System.out.println(db_Instance.hashCode());

		Constructor<Db_Instance> constructor = Db_Instance.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		Db_Instance newInstance = constructor.newInstance();
		System.out.println(newInstance.hashCode());

	}

}

class Db_Instance {

	private static Db_Instance instance = null;
	private static Db_Instance instance2 = new Db_Instance();

	private Db_Instance() {
		if (instance2 != null) {
			throw new RuntimeException("Object Already Exist");
		}
	}

	public static Db_Instance lazyInstance() {

		synchronized (Db_Instance.class) {
			if (instance == null) {
				return instance = new Db_Instance();
			}
		}
		return instance;

	}

	public static Db_Instance eagerInstance() {

		return instance2;
	}
}
