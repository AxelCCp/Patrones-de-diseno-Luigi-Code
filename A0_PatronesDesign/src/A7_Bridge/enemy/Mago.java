package A7_Bridge.enemy;

import A7_Bridge.figther.Fighter;

public class Mago extends Enemy {
	
	public Mago() {
		// TODO Auto-generated constructor stub
		setFighter(new MagoFighterImpl());
	}

	@Override
	public int getHealth() {
		// TODO Auto-generated method stub
		return super.getHealth();
	}

	@Override
	public void setHealth(int health) {
		// TODO Auto-generated method stub
		super.setHealth(health);
	}
	
	@Override
	public Fighter getFighter() {
		// TODO Auto-generated method stub
		return super.getFighter();
	}

	@Override
	public void setFighter(Fighter fighter) {
		// TODO Auto-generated method stub
		super.setFighter(fighter);
	}

	
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("Mago:");
		getFighter().attack();
	}
	
	public void protect() {
		// TODO Auto-generated method stub
		System.out.println("Mago:");
		getFighter().protect();
	}

	
	
}
