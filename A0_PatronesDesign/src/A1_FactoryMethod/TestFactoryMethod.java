package A1_FactoryMethod;

public class TestFactoryMethod {
	
	public static void main(String[] args) {
		
		Enemy warrior = new WarriorFactory().createEnemy();
		Enemy mago = new MagoFactory().createEnemy();
		
		warrior.attack();
		mago.attack();
		
	}

}
