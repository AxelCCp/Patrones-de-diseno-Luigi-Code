package A7_Bridge.enemy;

import A7_Bridge.figther.Fighter;

public abstract class Enemy {
	
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	
	public Fighter getFighter() {
		return fighter;
	}

	public void setFighter(Fighter fighter) {
		this.fighter = fighter;
	}



	protected int health;
	protected Fighter fighter;
	
}
