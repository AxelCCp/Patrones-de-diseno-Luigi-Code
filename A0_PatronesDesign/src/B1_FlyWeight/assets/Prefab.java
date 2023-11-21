package B1_FlyWeight.assets;

import java.util.ArrayList;
import java.util.List;

public class Prefab {
	
	public Prefab(List<Animation> animations, List<Texture> textures, List<Sound> sounds) {
		this.name = "Prefab" + id;
		this.animations = animations;
		this.textures = textures;
		this.sounds = sounds;
		id++;
	}
	
	
	
	public int getId() {
		return id;
	}



	@Override
	public String toString() {
		return "Prefab [name=" + name + ", animations=" + animations + ", textures=" + textures + ", sounds=" + sounds
				+ "]";
	}



	private static int id = 1;
	private String name;
	private List<Animation>animations = new ArrayList<>();
	private List<Texture>textures = new ArrayList<>();
	private List<Sound>sounds = new ArrayList<>();
	

}
