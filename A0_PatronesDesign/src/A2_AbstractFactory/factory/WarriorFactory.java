package A2_AbstractFactory.factory;

import A2_AbstractFactory.armor.Armor;
import A2_AbstractFactory.armor.HeavyArmor;
import A2_AbstractFactory.enemy.Enemy;
import A2_AbstractFactory.enemy.Warrior;
import A2_AbstractFactory.weapon.Hacha;
import A2_AbstractFactory.weapon.Weapon;

public class WarriorFactory extends EnemyAbstractFactory{

	@Override
	public Enemy createEnemy() {
		// TODO Auto-generated method stub
		return new Warrior();
	}

	@Override
	public Armor createArmor() {
		// TODO Auto-generated method stub
		return new HeavyArmor();
	}

	@Override
	public Weapon createWeapon() {
		// TODO Auto-generated method stub
		return new Hacha();
	}

}
