package B7_Memento;

public class Memento {
	
	public Memento(Game game) {
		this.level = game.getLevel();
		this.kills = game.getKills();
	}
	
	
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getKills() {
		return kills;
	}
	public void setKills(int kills) {
		this.kills = kills;
	}



	private int level;
	private int kills;

}
