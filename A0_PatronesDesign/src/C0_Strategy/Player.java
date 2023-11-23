package C0_Strategy;

public class Player {
	
	public Player(String name) {
		this.name = name;
		this.health = 100;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}


	private String name;
	private int health;

}
