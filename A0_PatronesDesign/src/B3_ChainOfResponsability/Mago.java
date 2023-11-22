package B3_ChainOfResponsability;

public class Mago {
	
	
	public Mago(ElementaryAttack elementaryAttack) {
		// TODO Auto-generated constructor stub
		this.elementaryAttack = elementaryAttack;
	}
	
	
	public ElementaryAttack getElementaryAttack() {
		return elementaryAttack;
	}

	
	public void setElementaryAttack(ElementaryAttack elementaryAttack) {
		this.elementaryAttack = elementaryAttack;
	}


	public void chainAttack(Player player) {
		System.out.println("Attack to " + player.getTypeplayer().name().toLowerCase());
		elementaryAttack.attack(player);
		
	}
	
	private ElementaryAttack elementaryAttack;
	
}
