package B1_FlyWeight;

import B1_FlyWeight.assets.AssetsPrefab;
import B1_FlyWeight.assets.Prefab;

public class NpcFactory {

	
	public static Npc createNpc(Prefab prefab) {
		Prefab prefabNew = AssetsPrefab.getPrefab(prefab);
		Npc npc = new Npc(prefabNew);
		return npc;
	}
	
}
