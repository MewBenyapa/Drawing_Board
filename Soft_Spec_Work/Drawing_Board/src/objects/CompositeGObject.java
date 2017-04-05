package objects;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class CompositeGObject extends GObject {

	private List<GObject> gObjects;

	public CompositeGObject() {
		super(0, 0, 0, 0);
		gObjects = new ArrayList<GObject>();
	}

	public void add(GObject gObject) {
		gObjects.add(gObject);
	}

	public void remove(GObject gObject) {
		gObjects.remove(gObject);
	}

	@Override
	public void move(int dX, int dY) {
		super.x += dX;
		super.y += dY;
		for(GObject g : gObjects) {
			g.move(dX, dY);
		}
	}
	
	public void recalculateRegion() {
		int minX = 400, maxX = 0, width = 0;
		int minY = 400, maxY = 0, height = 0;
		for(GObject g : gObjects) {
			if(g.x < minX) {
				minX = g.x;
			}
			if(g.x > maxX) {
				maxX = g.x;
				width = g.width;
			}
			if(g.y < minY) {
				minY = g.y;
				height = g.height;
			}
			if(g.y > maxY) {
				maxY = g.y;
			}
		}
		super.x = minX;
		super.y = minY;
		super.width = (maxX + width) - minX;
		super.height = maxY + height - minY;
	}

	@Override
	public void paintObject(Graphics g) {
		for(GObject go : gObjects) {
			go.paintObject(g);
		}
	}

	@Override
	public void paintLabel(Graphics g) {
		g.drawString("Grouped", x, y);
	}
	
}