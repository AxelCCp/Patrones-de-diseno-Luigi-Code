package C2_Visitor;

public class Warrior implements Visitable{
	
	public Warrior(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public void powerAttack() {
		System.out.println(this.getName() + " power attack!!!");
	}

	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	private String name;

}
