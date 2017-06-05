package command;

import model.Player;

public class CommandTurnWest extends Command {
	
	public CommandTurnWest(long timeInGame) {
		super(timeInGame);
	}

	@Override
	public void execute(Player player) {
		player.turnWest();
	}
	
	

}
