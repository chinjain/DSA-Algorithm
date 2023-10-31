package designpattern;

public class ProxyDesignPattern {

	public static void main(String[] args) {
		RealImage image = new RealImage("Test.png");
		ImageProxy proxy = new ImageProxy();
		proxy.display();
	}

}

@FunctionalInterface
interface image {
	void display();
}

class RealImage implements image {

	private String fileName;

	public RealImage(String file) {
		this.fileName = file;
		loadFromDisk();
	}

	private void loadFromDisk() {
		System.out.println("Loading " + fileName);
	}

	@Override
	public void display() {
		System.out.println("Displaying " + fileName);
	}

}

class ImageProxy implements image {

	private RealImage realImage;
	private String filename;

	@Override
	public void display() {
		if (realImage == null) {
			realImage = new RealImage(filename);
		}

		realImage.display();
	}

}