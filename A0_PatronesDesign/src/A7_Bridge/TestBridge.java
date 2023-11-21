package A7_Bridge;

import A7_Bridge.enemy.Mago;
import A7_Bridge.enemy.MagoFighterImpl;
import A7_Bridge.enemy.Warrior;
import A7_Bridge.figther.WarriorFighterImpl;

public class TestBridge {

	public static void main(String[] args) {
		
		System.out.println("------------------------WARRIOR------------------------");
		Warrior warrior = new Warrior();
		warrior.attack();
		warrior.protect();
		warrior.setFighter(new MagoFighterImpl());
		warrior.attack();
		warrior.attack();
		
		System.out.println("------------------------MAGO------------------------");
		Mago mago = new Mago();
		mago.attack();
		mago.protect();
		mago.setFighter(new WarriorFighterImpl());
		mago.attack();
		mago.protect();
	}
}
