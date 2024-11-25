import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization_Of_Obj {

	/*
	 * 
	 * Conversion of object to a byte stream is called serialiazation and we can
	 * store that bytestream into the Secondary Memory
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		String filename = "C:\\Users\\chinmay1.jain\\Documents\\Chinmay_Jain_Docs\\testFile.txt";
		person p1 = new person("chinmay Jain ABC");

		try {
			
			FileOutputStream fileOutputStream = new FileOutputStream(filename);
			ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);
			oos.writeObject(p1);
			
			oos.close();
			fileOutputStream.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}

		
		
		try {
			
			FileInputStream fileInputStream = new FileInputStream(filename);
			ObjectInputStream ios = new ObjectInputStream(fileInputStream);
			
			person p2 = (person) ios.readObject();
			System.out.println(p2.getName());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}

class person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;

	public person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
