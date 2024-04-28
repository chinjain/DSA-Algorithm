package designpattern;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 * The Observer Design Pattern is a behavioral design pattern in Java that defines a one-to-many dependency between objects. 
 * 
 * When the state of one object (the subject) changes, all its dependents (observers) are notified and updated automatically. 
 * 
 * This pattern is commonly used for implementing distributed event handling systems, 
 * 
 * in which one object (the subject) needs to notify a list of dependents (observers) about state changes.

Here's how you can implement the Observer Design Pattern in Java:
 * 
 * 
 */

public class ObserverDesignPattern {

	public static void main(String[] args) {
//		YoutubeChannel ytc = new YoutubeChannel();
//		Subscriber subscriber = new Subscriber("aman");
//		ytc.subscribe(subscriber);
//		ytc.notifyChanges();
		ConcreteSubject subject = new ConcreteSubject();

		ConcreteObersver o1 = new ConcreteObersver("Observer 1");
		ConcreteObersver o2 = new ConcreteObersver("Observer 2");
		ConcreteObersver o3 = new ConcreteObersver("Observer 3");

		subject.registerObserver(o1);
		subject.registerObserver(o2);
		subject.registerObserver(o3);

		subject.setMessage("Welcome All Observers");

		subject.removeObserver(o2);

	}

}

interface Observer {

	void update(String message);
}

interface Subject {
	// notifiy changes method we have in this

//	void subscribe(Observer ob);

//	void unSubscribe(Observer ob);

//	void notifyChanges();
	void registerObserver(Observer observer);

	void removeObserver(Observer observer);

	void notifyObservers();

}

class ConcreteSubject implements Subject {

	List<Observer> observers = new ArrayList<Observer>();
	private String message;

	@Override
	public void registerObserver(Observer observer) {
		this.observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		this.observers.remove(observer);

	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (Observer observer : this.observers) {
			observer.update(message);
		}

	}

	public void setMessage(String msg) {
		this.message = msg;
		notifyObservers();
	}

}

class ConcreteObersver implements Observer {

	private String name;

	public ConcreteObersver(String name) {
		this.name = name;
	}

	@Override
	public void update(String message) {
		System.out.println(name + " received the message: " + message);
	}

}