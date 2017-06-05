package command;

import model.Player;

public class CommandTurnEast extends Command {
	
	public CommandTurnEast(long timeInGame) {
		super(timeInGame);
	}

	@Override
	public void execute(Player player) {
		player.turnEast();
	}
	
	

}
