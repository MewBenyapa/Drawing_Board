package model;

public class Player {

	private Point location;
	private Point velocity;
	
	private int radius;
	
	public Player(Point location) {
		this.location = location;
		this.velocity = new Point();
		radius = 10;
	}

	public Point getLocation() {
		return location;
	}

	public Point getVelocity() {
		return velocity;
	}

	public int getRadius() {
		return radius;
	}
	
	public void turnWest() {
		velocity = Point.WEST;
	}

	public void turnEast() {
		velocity = Point.EAST;
	}

	public void turnNorth() {
		velocity = Point.NORTH;
	}

	public void turnSouth() {
		velocity = Point.SOUTH;
	}
	
	public void update() {
		move();
	}
	
	public void move() {
		location.add(velocity);	
	}

}
