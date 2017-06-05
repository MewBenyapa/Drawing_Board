package model;

public class World {

	private Point size;
	private Player player;

	public World() {
		reset();
	}
	
	public void reset() {
		size = new Point(300, 300);
		player = new Player(new Point(size.getX() / 2, size.getY() * 3 / 4));
		player.turnNorth();
	}

	public void update() {
		player.update();
	}

	public boolean playerHitWalls() {
		int pX = player.getLocation().getX();
		int pY = player.getLocation().getY();
		return (pX < 0 || pY < 0 || pX > size.getX() || pY > size.getY());
	}

	public Player getPlayer() {
		return player;
	}

	public Point getSize() {
		return size;
	}

}
