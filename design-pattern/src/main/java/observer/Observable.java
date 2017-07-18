package observer;

public interface Observable<Observer> {
	
	void add(Observer observer);
	
	void remove(Observer observer);
	
	void notifyObservers(Notification<Observer> notification);
	
	public interface Notification<Observer>{
		void sendTo(Observer observer);
	}

}
