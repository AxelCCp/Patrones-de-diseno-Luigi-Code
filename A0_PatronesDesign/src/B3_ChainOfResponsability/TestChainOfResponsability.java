package B3_ChainOfResponsability;

public class TestChainOfResponsability {

	public static void main(String[] args) {
		
		Player player = new Player(TypePlayer.ASSASIN);
	
		Mago mago = new Mago(new FireAttack(new IceAttack(new ElectricAttack())));
		
		mago.chainAttack(player);
	}
}
