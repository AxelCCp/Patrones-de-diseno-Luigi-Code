package A5_SingletonMultiHilo;

public class Player {
	
	private Player(String name) {
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.name = name;
	}
	
	public static synchronized Player getPlayer(String name) {
		if(player == null)
			player = new Player(name);
		return player;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Player [name=" + name + "]";
	}




	private String name;
	private static volatile Player player;	//los procesadores tiene varios nucleos y cada nucleo tiene su memoria "cache" con volatile le decimos q no guarde la info en la cache del nucleo sino q la guarde en la ram, para que todos los hilos apunten a una memoria compartida y así poder usar el singleton.

}
