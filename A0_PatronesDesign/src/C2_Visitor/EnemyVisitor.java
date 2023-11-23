package C2_Visitor;

public class EnemyVisitor implements Visitor{

	@Override
	public void visit(Warrior warrior) {
		System.out.println("Visiting warrior");
		warrior.powerAttack();
	}

	@Override
	public void visit(Mago mago) {
		System.out.println("Visiting mago");
		mago.elementaryAttack();
	}

	@Override
	public void visit(Assassin assassin) {
		System.out.println("Visiting assassin");
		assassin.killAttack();
	}

}
