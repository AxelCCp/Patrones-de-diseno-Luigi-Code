package B6_Mediator_v2;

public interface Combat {

	void send();
	void receive(Combat combat);
	
}
