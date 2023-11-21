package A9_Decorator;

import A9_Decorator.decorator.AsesinoEnemyDecorator;
import A9_Decorator.decorator.MagoEnemyDecorator;
import A9_Decorator.decorator.WarriorEnemyDecorator;
import A9_Decorator.raza.Elfo;
import A9_Decorator.raza.Humano;

public class TestDecorator {

	public static void main(String[] args) {
		
		System.out.println("----------------- Human Warrrior --------------------");
		Enemy humanWarrior = new WarriorEnemyDecorator(new Humano());
		humanWarrior.attack();
		
		System.out.println("-------------- Human Warrrior Mago ------------------");
		Enemy humanWarriorMago = new WarriorEnemyDecorator(new MagoEnemyDecorator(new Humano()));
		humanWarriorMago.attack();
		
		System.out.println("------------ Elfo Warrrior Mago Asesino -------------");
		Enemy elfoWarriorMagoAsesino = new AsesinoEnemyDecorator(new MagoEnemyDecorator(new WarriorEnemyDecorator(new Elfo())));
		elfoWarriorMagoAsesino.attack();
	}
}
