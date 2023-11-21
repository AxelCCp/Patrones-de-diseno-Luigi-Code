package B1_FlyWeight;

import java.util.Arrays;
import java.util.List;

import B1_FlyWeight.assets.Animation;
import B1_FlyWeight.assets.Prefab;
import B1_FlyWeight.assets.Sound;
import B1_FlyWeight.assets.Texture;

public class TestFlyweight {
	
	
	public static void main(String[] args) {
		
		List<Animation> animations = Arrays.asList(new Animation("walk"), new Animation("run"));
		
		List<Texture> textures = Arrays.asList(new Texture("texture1"), new Texture("texture2"));
		
		List<Sound> sounds = Arrays.asList(new Sound("bla"), new Sound("ble"));
		
		Prefab prefab1 = new Prefab(animations, textures, sounds);
		
		Npc npc1 = new Npc(prefab1);
		
		Npc npc2 = new Npc(prefab1);
		
		System.out.println("--------NPC 1--------");
		npc1.showNpc();
		
		System.out.println("--------NPC 2--------");
		npc2.showNpc();
	}

}
