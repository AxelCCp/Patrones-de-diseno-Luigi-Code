package B6_Mediator_v1;

public class TestMediator {

	public static void main(String[] args) {

		Enemy enemy1 = new Enemy("Enemy 1");
		Enemy enemy2 = new Enemy("Enemy 2");
		Enemy enemy3 = new Enemy("Enemy 3");
		
		enemy1.add(enemy2);
		enemy1.add(enemy3);
		
		enemy2.add(enemy1);
		enemy2.add(enemy3);
		
		enemy3.add(enemy1);
		enemy3.add(enemy2);

		enemy1.send();
		enemy2.send();
	}
}
