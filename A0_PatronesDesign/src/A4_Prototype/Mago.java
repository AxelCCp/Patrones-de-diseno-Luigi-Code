package A4_Prototype;

public class Mago extends Enemy{
	
	public Mago(int health, int damage, int mana) {
		super(health, damage);
		this.mana = mana;
	}
	
	
	public Mago(Mago mago) {
		super(mago);
		if(mago != null) {
			this.setMana(mago.getMana());
		}
	}

	
	@Override
	public Enemy clone() {
		// TODO Auto-generated method stub
		return new Mago(this);
	}

	
	
	@Override
	public String toString() {
		return "Mago [mana=" + mana + ", health=" + health + ", damage=" + damage + "]";
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	private int mana;

}
