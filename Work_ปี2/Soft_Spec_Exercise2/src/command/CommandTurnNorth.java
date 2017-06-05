package command;

import model.Player;

public class CommandTurnNorth extends Command {
	
	public CommandTurnNorth(long timeInGame) {
		
		super(timeInGame);
	}

	@Override
	public void execute(Player player) {
		player.turnNorth();
	}
	
	

}
