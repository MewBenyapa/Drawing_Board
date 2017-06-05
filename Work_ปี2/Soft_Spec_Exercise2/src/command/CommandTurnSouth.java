package command;

import model.Player;

public class CommandTurnSouth extends Command {
	
	public CommandTurnSouth(long timeInGame) {
		super(timeInGame);
	}

	@Override
	public void execute(Player player) {
		player.turnSouth();
	}
	
	

}
