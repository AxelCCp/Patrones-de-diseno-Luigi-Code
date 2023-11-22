package B4_Command;

public class MoveBackCommand implements Command {
	
	public MoveBackCommand(Player player) {
		this.player = player;
	}
	

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		player.moveBack();
	}

	private Player player;
	
}
