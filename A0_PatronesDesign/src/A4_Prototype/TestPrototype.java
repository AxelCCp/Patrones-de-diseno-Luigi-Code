package A4_Prototype;

public class TestPrototype {

	public static void main(String[] args) {
		
		Warrior warrior1 = new Warrior(100, 100, 100);
		Warrior warrior2 = (Warrior) warrior1.clone(); 
		
		System.out.println(warrior1);
		System.out.println(warrior2);
		System.out.println("-----------------");
		
		warrior2.setHealth(0);
		

		System.out.println(warrior1);
		System.out.println(warrior2);
		
		System.out.println("****************************");
		
		Mago mago1 = new Mago(100, 100, 100);
		Mago mago2 = (Mago) mago1.clone();
		System.out.println(mago1);
		System.out.println(mago2);
		
		System.out.println("-----------------");
		
		mago2.setHealth(50);
		
		System.out.println(mago1);
		System.out.println(mago2);
		
	}
}
