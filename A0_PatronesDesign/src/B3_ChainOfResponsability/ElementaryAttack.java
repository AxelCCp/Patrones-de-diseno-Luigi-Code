package B3_ChainOfResponsability;

public abstract class ElementaryAttack {

	public ElementaryAttack() {
		// TODO Auto-generated constructor stub
	}
	
	
	public ElementaryAttack(ElementaryAttack next) {
		super();
		this.next = next;
	}


	public ElementaryAttack getNext() {
		return next;
	}


	public void setNext(ElementaryAttack next) {
		this.next = next;
	}

	
	public boolean hasNext() {
		return getNext() != null;
	}

	public  abstract void attack(Player player);
	
	
	protected ElementaryAttack next;
	
}
