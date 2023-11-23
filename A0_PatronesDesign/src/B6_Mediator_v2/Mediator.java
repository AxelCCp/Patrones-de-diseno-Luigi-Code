package B6_Mediator_v2;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
	
	private List<Combat> combats = new ArrayList<>();
	
	public void add(Combat combat) {
		combats.add(combat);
	}
	
	public void send(Combat combat) {
		for(Combat c : combats) {
			if(c != combat) {
				c.receive(combat);
			}
		}
	}

}
