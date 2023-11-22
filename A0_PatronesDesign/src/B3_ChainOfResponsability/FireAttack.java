package B3_ChainOfResponsability;

public class FireAttack extends ElementaryAttack{
	
	public FireAttack() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FireAttack(ElementaryAttack next) {
		super(next);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack(Player player) {
		if(player.getTypeplayer().equals(TypePlayer.VAMP)) {
			System.out.println("Fire attack!!!");
		} else if(hasNext()){
			getNext().attack(player);
		} else {
			System.out.println("No attack was found!!!");
		}
	}
}
