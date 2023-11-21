package A2_AbstractFactory.principal;

import A2_AbstractFactory.armor.Armor;
import A2_AbstractFactory.enemy.Enemy;
import A2_AbstractFactory.factory.EnemyAbstractFactory;
import A2_AbstractFactory.factory.MagoFactory;
import A2_AbstractFactory.factory.WarriorFactory;
import A2_AbstractFactory.weapon.Weapon;

public class TestAbstractFactory {

	public static void main(String[] args) {
		
		EnemyAbstractFactory factory = new WarriorFactory();
		Enemy warrior = factory.createEnemy();
		Armor heavyArmor = factory.createArmor();
		Weapon hacha = factory.createWeapon();
		warrior.attack();
		heavyArmor.protect();
		hacha.damage();
		
		factory = new MagoFactory();
		Enemy mago = factory.createEnemy();
		Armor tunica = factory.createArmor();
		Weapon baston = factory.createWeapon();
		mago.attack();
		tunica.protect();
		hacha.damage();
	}
}
