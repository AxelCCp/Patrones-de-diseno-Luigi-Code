package C0_Strategy;

public class TestStrategy {
	
	public static void main(String[] args) {
		
		Player player1 = new Player("Player 1");
		Enemy enemy1 = new Enemy("Enemy 1");
		enemy1.attack(player1);
		
		System.out.println("----------------------------------");
		enemy1.setAttackStrategy(new WarriorAttack());
		enemy1.attack(player1);
		
		
		System.out.println("----------------------------------");
		enemy1.setAttackStrategy(new MagoAttack());
		enemy1.attack(player1);
	}

}
