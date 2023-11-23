package C0_Strategy;

public class WarriorAttack implements AttackStrategy{

	@Override
	public void attack(Player player) {
		System.out.println(player.getName() + " health before warrior attack: " + player.getHealth());
		System.out.println("Warrior attacking...");
		player.setHealth(player.getHealth() - 20);
		System.out.println(player.getName() + " health after warrior attack: " + player.getHealth());
	}

}
