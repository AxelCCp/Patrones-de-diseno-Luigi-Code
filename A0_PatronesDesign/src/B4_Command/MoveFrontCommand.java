package B4_Command;

public class MoveFrontCommand implements Command{

	public MoveFrontCommand(Player player) {
		// TODO Auto-generated constructor stub
		this.player = player;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		player.moveFront();
	}

	
	private Player player;
}
