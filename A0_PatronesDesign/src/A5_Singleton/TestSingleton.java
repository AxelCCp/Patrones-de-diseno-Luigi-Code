package A5_Singleton;

public class TestSingleton {

	public static void main(String[] args) {
		
		//siempre va a ser pepe
		
		Player player = Player.getPlayer("pepe");
		System.out.println(player);
		
		player = Player.getPlayer("manolo");
		System.out.println(player);
	}
}
