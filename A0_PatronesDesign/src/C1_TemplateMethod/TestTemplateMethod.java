package C1_TemplateMethod;

public class TestTemplateMethod {
	
	public static void main(String[] args) {
		
		EnemyTemplate warrior = new Warrior();
		
		EnemyTemplate mago = new Mago();
		
		warrior.template();
		
		mago.template();
	}

}
