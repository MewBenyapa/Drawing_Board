package model;

import java.util.ArrayList;
import java.util.List;

import command.Command;
import command.CommandTurnEast;
import command.CommandTurnNorth;
import command.CommandTurnSouth;
import command.CommandTurnWest;

public class Game {

	public static final long DELAY = 10;

	private World world;
	private boolean over;
	private long startTime;
	private long timeInGame;

	// TODO: Need a list to store commands.
	private List<Command> commands = new ArrayList<Command>();
	
	public Game() {
		world = new World();
	}

	public void startGame() {
		world.reset();
		over = false;
		startTime = System.currentTimeMillis();
		while (!over) {
			timeInGame = System.currentTimeMillis() - startTime;
			world.update();
			over = world.playerHitWalls();
			delay();
		}
	}

	public void startReplay() {
		world.reset();
		over = false;
		startTime = System.currentTimeMillis();
		while(!over) {
			timeInGame = System.currentTimeMillis() - startTime;
			if(!commands.isEmpty()) {
				Command c = commands.get(0);
				if(timeInGame >= c.getTimeInGame()) {
					commands.remove(c);
					c.execute(world.getPlayer());
				}
			}
			world.update();
			over = world.playerHitWalls();
			delay();
		}
	}
	
	public boolean isOver() {
		return over;
	}
	
	public long getTimeInGame() {
		return timeInGame;
	}
	
	public Point getWorldSize() {
		return world.getSize();
	}

	public Point getPlayerLocation() {
		return world.getPlayer().getLocation();
	}

	public int getPlayerRadius() {
		return world.getPlayer().getRadius();
	}

	public void turnPlayerWest() {
		processCommand(new CommandTurnWest(timeInGame));
	}

	public void turnPlayerEast() {
		processCommand(new CommandTurnEast(timeInGame));
	}

	public void turnPlayerNorth() {
		processCommand(new CommandTurnNorth(timeInGame));
	}

	public void turnPlayerSouth() {
		processCommand(new CommandTurnSouth(timeInGame));
	}
	
	private void processCommand(Command c) {
		c.execute(world.getPlayer());
		commands.add(c);
	}

	private void delay() {
		try {
			Thread.sleep(DELAY);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
