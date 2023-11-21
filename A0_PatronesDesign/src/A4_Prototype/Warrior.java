package A4_Prototype;

public class Warrior extends Enemy{

	public Warrior(int health, int damage, int endurance) {
		super(health, damage);
		this.endurance = endurance;
	}
	
	public Warrior(Warrior warrior) {
		super(warrior);
		if(warrior != null) {
			this.setEndurance(warrior.getEndurance());
		}
	}
	
	@Override
	public Enemy clone() {
		// TODO Auto-generated method stub
		return new Warrior(this);
	}
	
	

	public int getEndurance() {
		return endurance;
	}

	public void setEndurance(int endurance) {
		this.endurance = endurance;
	}
	


	@Override
	public String toString() {
		return "Warrior [endurance=" + endurance + ", health=" + health + ", damage=" + damage + "]";
	}



	private int endurance;



	
}
