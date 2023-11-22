package B4_Command;

public class JumpCommand implements Command{

	public JumpCommand(Player player) {
		this.player = player;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		player.jump();
	}

	private Player player;
}
