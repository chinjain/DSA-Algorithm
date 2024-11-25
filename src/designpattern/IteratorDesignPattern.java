package designpattern;

import java.util.ArrayList;
import java.util.List;

public class IteratorDesignPattern {

	public static void main(String[] args) {

		/*
		 * 
		 * Iterator provides a way to access the object sequential and we can traverse
		 * the object one by one
		 * 
		 * 
		 * 
		 */

		UserManagement management = new UserManagement();
		management.addUser(new User1("Chinmay", "1234"));
		management.addUser(new User1("Himanshi", "03"));
		management.addUser(new User1("Sambhu", "08"));

		MyIterator iterator = management.getIterator();

		while (iterator.hasNext()) {

			System.out.println(iterator.next());

		}

	}

}

class UserManagement {

	private final List<User1> userList = new ArrayList<User1>();

	public void addUser(User1 user) {
		this.userList.add(user);
	}

	public User1 getUser(int idx) {

		if (idx > userList.size()) {
			return null;
		}

		return this.userList.get(idx);
	}

	public MyIterator getIterator() {

		return new MyIteratorImpl(userList);

	}
}

class User1 {

	String name;
	String userId;

	public User1(String name, String userId) {

		this.name = name;
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "User1 [name=" + name + ", userId=" + userId + "]";
	}

}

interface MyIterator {

	boolean hasNext();

	Object next();

}

class MyIteratorImpl implements MyIterator {

	private final List<User1> list;
	private final int length;
	private int pos = 0;

	public MyIteratorImpl(List<User1> list) {

		this.list = list;
		this.length = list.size();
	}

	@Override
	public boolean hasNext() {

        return pos < length;

	}

	@Override
	public Object next() {

		User1 user = list.get(pos++);
		return user;
	}

}