package B8_Observer;

public abstract class Enemy {

	
	public Enemy(String name) {
		this.name = name;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}


	public abstract void attack();
	public abstract void activate();

	private String name;
	private boolean active;
	
}
