package A9_Decorator.decorator;

import A9_Decorator.Enemy;

public class AsesinoEnemyDecorator extends EnemyDecorator{

	public AsesinoEnemyDecorator(Enemy enemy) {
		super(enemy);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		super.attack();
		System.out.println("Asesino attack!!!");
	}
	
	

}
