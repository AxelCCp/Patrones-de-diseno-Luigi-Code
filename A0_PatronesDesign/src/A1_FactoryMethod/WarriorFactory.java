package A1_FactoryMethod;

public class WarriorFactory extends EnemyFactory{

	@Override
	public Enemy createEnemy() {
		// TODO Auto-generated method stub
		return new Warrior();
	}

}
