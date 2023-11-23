package C2_Visitor;

public class Assassin implements Visitable{

	public Assassin(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public void killAttack() {
		System.out.println(this.getName() + " kill attack!!!");
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	private String name;
	
}
