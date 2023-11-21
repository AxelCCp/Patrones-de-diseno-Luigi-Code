package A2_AbstractFactory.factory;

import A2_AbstractFactory.armor.Armor;
import A2_AbstractFactory.enemy.Enemy;
import A2_AbstractFactory.weapon.Weapon;

public abstract class EnemyAbstractFactory {

	public abstract Enemy createEnemy();
	public abstract Armor createArmor();
	public abstract Weapon createWeapon();
	
}
