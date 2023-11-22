package B3_ChainOfResponsability;

public class ElectricAttack extends ElementaryAttack{

	public ElectricAttack() {
	}

	public ElectricAttack(ElementaryAttack next) {
		super(next);
	}
	
	@Override
	public void attack(Player player) {
		if(player.getTypeplayer().equals(TypePlayer.MAGO)) {
			System.out.println("Electric attack!!!");
		} else if(hasNext()){
			getNext().attack(player);
		} else {
			System.out.println("No attack was found!!!");
		}
	}
	
}
