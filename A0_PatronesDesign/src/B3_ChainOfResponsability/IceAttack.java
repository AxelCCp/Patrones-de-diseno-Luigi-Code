package B3_ChainOfResponsability;

public class IceAttack extends ElementaryAttack{

	
	public IceAttack() {
	}

	public IceAttack(ElementaryAttack next) {
		super(next);
	}

	@Override
	public void attack(Player player) {
		if(player.getTypeplayer().equals(TypePlayer.WARRIOR)) {
			System.out.println("ICE attack!!!");
		} else if(hasNext()){
			getNext().attack(player);
		} else {
			System.out.println("No attack was found!!!");
		}
	}
	
	

}
