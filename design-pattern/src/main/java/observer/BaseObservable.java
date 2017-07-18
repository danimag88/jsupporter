package observer;

import java.util.ArrayList;
import java.util.List;

public class BaseObservable<Observer> implements Observable<Observer> {
	
	private List<Observer> observers;
	
	public BaseObservable() {
		observers = new ArrayList<>();
	}

	@Override
	public void add(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void remove(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers(observer.Observable.Notification<Observer> notification) {
		for(Observer observer:observers){
			notification.sendTo(observer);
		}
	}

}
