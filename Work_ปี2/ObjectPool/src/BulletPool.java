import java.util.ArrayList;
import java.util.List;

public class BulletPool {
	
	private List<Bullet> bullets;
	
	private static BulletPool instance;
	
	private BulletPool() {
		bullets = new ArrayList<Bullet>();
		for(int i = 0; i < 20; i++) {
			bullets.add(new Bullet());
		}
	}
	
	public static BulletPool getInstance() {
		if(instance == null) {
			instance = new BulletPool();
		}
		return instance;
	} 

	private Bullet nextAvailableBullet() {
		for(Bullet b : bullets) {
			if(!b.isActive()) {
				return b;
			}
		}
		Bullet b = new Bullet();
		bullets.add(b);
		return b;
	}
}
