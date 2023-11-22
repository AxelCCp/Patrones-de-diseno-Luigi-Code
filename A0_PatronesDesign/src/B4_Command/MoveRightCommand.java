package B4_Command;

public class MoveRightCommand implements Command{

	public MoveRightCommand(Player player) {
		this.player = player;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		player.moveRight();
	}

	private Player player;
}
