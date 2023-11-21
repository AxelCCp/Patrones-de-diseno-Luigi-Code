package A1_FactoryMethod;

public class MagoFactory extends EnemyFactory{

	@Override
	public Enemy createEnemy() {
		// TODO Auto-generated method stub
		return new Mago();
	}

}
