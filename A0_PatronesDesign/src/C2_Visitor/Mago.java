package C2_Visitor;

public class Mago implements Visitable{

	public Mago(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public void elementaryAttack() {
		System.out.println(this.getName() + " elementary attack!!!");
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	private String name;
	
}
