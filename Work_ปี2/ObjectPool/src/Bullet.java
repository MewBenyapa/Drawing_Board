
public class Bullet {
	
	private long firedAt;
	private boolean active;
	
	public void fire() {
		firedAt = System.currentTimeMillis();
		active = true;
	}
	
	public boolean hitWall() {
		long time = System.currentTimeMillis();
		return time - firedAt > 1000;
	}
	
	public void deactivate() {
		active = false;
	}

	//--------------------------
	public boolean isActive() {
		if(!hitWall()) {
			return false;
		}
		return true;
	}
	//--------------------------
}
