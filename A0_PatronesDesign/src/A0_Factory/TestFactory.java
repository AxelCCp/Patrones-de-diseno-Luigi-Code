package A0_Factory;

public class TestFactory {

		public static void main(String[] args) {
			EnemyFactory enemyFactory = new EnemyFactory();
			Enemy warrior = enemyFactory.createEnemy("warrior");
			Enemy mago = enemyFactory.createEnemy("mago");
			warrior.attack();
			mago.attack();
		}
}
