
public class StaticExample {

	public static final long GUEST_ID = -1;
	private static final long USER_ID;

	static {
		USER_ID = getId();
	}

	private static long getId() {
		// TODO Auto-generated method stub
		return 0;
	}

}

class IdNotFound extends Exception {
	IdNotFound() {

	}
}