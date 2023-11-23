package B8_Observer;

public interface MyObserbable {
	
	void subscribe(MyObserver observer);
	void unsubscribe(MyObserver observer);
	void broadCast();

}
