package C0_Strategy;

public class MagoAttack implements AttackStrategy{

	@Override
	public void attack(Player player) {
		System.out.println(player.getName() + " health before mago attack: " + player.getHealth());
		System.out.println("Mago attacking...");
		player.setHealth(player.getHealth() - 20);
		System.out.println(player.getName() + " health after mago attack: " + player.getHealth());
	}

}
