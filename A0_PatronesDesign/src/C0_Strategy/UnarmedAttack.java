package C0_Strategy;

public class UnarmedAttack implements AttackStrategy{

	@Override
	public void attack(Player player) {
		System.out.println(player.getName() + " health before unarmed attack: " + player.getHealth());
		System.out.println("Unarmed attacking...");
		player.setHealth(player.getHealth() - 20);
		System.out.println(player.getName() + " health after unarmed attack: " + player.getHealth());
	}

}
