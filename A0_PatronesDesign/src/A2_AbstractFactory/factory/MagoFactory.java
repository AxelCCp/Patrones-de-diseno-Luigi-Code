package A2_AbstractFactory.factory;

import A2_AbstractFactory.armor.Armor;
import A2_AbstractFactory.armor.Tunica;
import A2_AbstractFactory.enemy.Enemy;
import A2_AbstractFactory.enemy.Mago;
import A2_AbstractFactory.weapon.BastonDeMago;
import A2_AbstractFactory.weapon.Weapon;

public class MagoFactory extends EnemyAbstractFactory{

	@Override
	public Enemy createEnemy() {
		// TODO Auto-generated method stub
		return new Mago();
	}

	@Override
	public Armor createArmor() {
		// TODO Auto-generated method stub
		return new Tunica();
	}

	@Override
	public Weapon createWeapon() {
		// TODO Auto-generated method stub
		return new BastonDeMago();
	}

}
