package C2_Visitor;

public class TestVisitor {
	
	public static void main(String[] args) {
		
		Warrior warrior = new Warrior("last warrior");
		
		Mago mago = new Mago("last mago"); 
		
		Assassin assassin = new Assassin("last assassin");
		
		EnemyVisitor visitor = new EnemyVisitor();
		
		visitor.visit(warrior);
		
		System.out.println("-------------------------------------");
		
		visitor.visit(mago);
		
		System.out.println("-------------------------------------");
		
		visitor.visit(mago);
		
		System.out.println("-------------------------------------");
		
		visitor.visit(assassin);
	
	}

}
