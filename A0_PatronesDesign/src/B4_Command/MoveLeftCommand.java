package B4_Command;

public class MoveLeftCommand implements Command{

	public MoveLeftCommand(Player player) {
		this.player = player;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		player.moveLeft();
	}

	private Player player;
}
