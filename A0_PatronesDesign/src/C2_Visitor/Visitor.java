package C2_Visitor;

public interface Visitor {

	
	void visit(Warrior warrior);
	void visit(Mago mago);
	void visit(Assassin assassin);
	
	
}
