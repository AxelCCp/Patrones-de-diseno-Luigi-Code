package B4_Command;

import java.util.HashMap;

public class MovementInvoker {
	
	
	public MovementInvoker(Player player) {
		
		this.player = player;
		
		commands.put('w', new MoveFrontCommand(player));
		commands.put('s', new MoveBackCommand(player));
		commands.put('d', new MoveRightCommand(player));
		commands.put('a', new MoveLeftCommand(player));
		commands.put('j', new JumpCommand(player));
	}
	
	public void move (char c) {
		
		if(!commands.containsKey(c)) {
			System.out.println("command not found");
		} else {
			commands.get(c).execute();
		}
		
	}

	private HashMap<Character, Command> commands = new HashMap<>();
	
	private Player player;
	
}
