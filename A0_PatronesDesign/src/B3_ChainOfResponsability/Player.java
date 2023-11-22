package B3_ChainOfResponsability;

public class Player {
	
	public Player() {}

	public Player(TypePlayer typeplayer) {
		this.typeplayer = typeplayer;
	}

	public TypePlayer getTypeplayer() {
		return typeplayer;
	}

	public void setTypeplayer(TypePlayer typeplayer) {
		this.typeplayer = typeplayer;
	}
	
	private TypePlayer typeplayer;


}
