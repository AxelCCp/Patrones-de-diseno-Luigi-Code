package C1_TemplateMethod;

public class Mago extends EnemyTemplate{

	@Override
	public void setSkills() {
		System.out.println("Health: 100, Mana: 100, Stamina:50");
	}

	@Override
	public void attack() {
		System.out.println("Mago attack!!!");
	}

	@Override
	public void protect() {
		System.out.println("Mago protect!!!");
	}

	@Override
	public void result() {
		System.out.println("Mago has survived...");
	}
	
}
