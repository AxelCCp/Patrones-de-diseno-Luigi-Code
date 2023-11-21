package B2_Proxy;

import java.io.Serializable;
import java.util.Date;

public class Stats implements Serializable{

	private static final long serialVersionUID = 1L;
	private String name;
	private int level;
	private int kills;
	private int deaths;
	private Date createAt;
	private Date lastSave;
	
	
	public Stats(String name, int level, int kills, int deaths) {
		super();
		this.name = name;
		this.level = level;
		this.kills = kills;
		this.deaths = deaths;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
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


	public int getDeaths() {
		return deaths;
	}


	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}


	public Date getCreateAt() {
		return createAt;
	}


	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}


	public Date getLastSave() {
		return lastSave;
	}


	public void setLastSave(Date lastSave) {
		this.lastSave = lastSave;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Stats [name=" + name + ", level=" + level + ", kills=" + kills + ", deaths=" + deaths + ", createAt="
				+ createAt + ", lastSave=" + lastSave + "]";
	}
	
	
	
	
	
}
