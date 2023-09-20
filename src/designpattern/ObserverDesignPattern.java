package designpattern;

import java.util.ArrayList;
import java.util.List;

public class ObserverDesignPattern {

	public static void main(String[] args) {
		YoutubeChannel ytc = new YoutubeChannel();
		Subscriber subscriber = new Subscriber("aman");
		ytc.subscribe(subscriber);
		ytc.notifyChanges();
	}

}

interface Observer {

	void notified();
}

interface Subject {
	// notifiy changes method we have in this

	void subscribe(Observer ob);

	void unSubscribe(Observer ob);

	void notifyChanges();

}

class Subscriber implements Observer {
	
	String name;
	public Subscriber(String name) {
		this.name = name;
	}

	@Override
	public void notified() {
		System.out.println("Hello" + name + " " + "New video uploaded : Notification");
	}
}

class YoutubeChannel implements Subject {

	List<Observer> subscriber = new ArrayList<Observer>();

	@Override
	public void subscribe(Observer ob) {
		
		this.subscriber.add(ob);
		System.err.println(subscriber.toString());
	}

	@Override
	public void unSubscribe(Observer ob) {
		this.subscriber.remove(ob);

	}

	@Override
	public void notifyChanges() {
		for (Observer ob : this.subscriber) {
			ob.notified();
		}

	}
}