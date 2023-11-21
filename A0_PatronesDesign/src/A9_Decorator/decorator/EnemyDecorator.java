package A9_Decorator.decorator;

import A9_Decorator.Enemy;

public abstract class EnemyDecorator implements Enemy{

	public EnemyDecorator(Enemy enemy) {
		// TODO Auto-generated constructor stub
		this.enemy = enemy;
	}
	
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		enemy.attack();
	}

	protected Enemy enemy;
}
