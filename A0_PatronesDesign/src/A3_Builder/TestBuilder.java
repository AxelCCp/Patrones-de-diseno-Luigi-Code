package A3_Builder;

public class TestBuilder {
	
	public static void main(String[] args) {
		
		
		Enemy enemy = Enemy.builder().name("pepe").type("Mago").build();
		System.out.println(enemy);
		
		Enemy enemy2 = Enemy.builder().name("bean").type("dog").health(100).damage(120).endurance(100).build();
		System.out.println(enemy2);
			
		
	}

}
