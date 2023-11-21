package A9_Decorator.decorator;

import A9_Decorator.Enemy;

public class WarriorEnemyDecorator extends EnemyDecorator {

	public WarriorEnemyDecorator(Enemy enemy) {
		super(enemy);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		super.attack();
		System.out.println("Warrior attack!!!");
	}

	
	
}
