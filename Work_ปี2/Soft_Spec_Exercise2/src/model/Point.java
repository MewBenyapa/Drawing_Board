package model;

public class Point {

	public static final Point NORTH = new Point(0, -1);
	public static final Point SOUTH = new Point(0, 1);
	public static final Point WEST = new Point(-1, 0);
	public static final Point EAST = new Point(1, 0);

	private int x;
	private int y;

	public Point() {
		this.x = this.y = 0;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public void add(Point point) {
		this.x += point.x;
		this.y += point.y;
	}

}
