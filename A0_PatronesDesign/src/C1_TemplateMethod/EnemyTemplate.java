package C1_TemplateMethod;

public abstract class EnemyTemplate {

	public abstract void setSkills();
	
	public abstract void attack();
	
	public abstract void protect();
	
	public abstract void result();
	
	public final void template() {					//se pone final para que ninguna clase hija sobreescriba el método
		this.setSkills();
		this.attack();
		this.protect();
		this.result();
	}
	
}
