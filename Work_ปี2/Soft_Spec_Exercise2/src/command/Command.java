package command;

import java.rmi.activation.ActivationGroupDesc.CommandEnvironment;

import model.Player;

//cannot build object
public abstract class Command {
	
	private long timeInGame;
	
	public Command(long timeInGame) {
		this.timeInGame = timeInGame;
	}
	
	public long getTimeInGame() {
		return timeInGame;
	}

	public abstract void execute(Player player);
	
}
