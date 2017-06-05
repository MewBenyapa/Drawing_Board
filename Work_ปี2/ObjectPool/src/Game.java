import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JFrame;

public class Game extends JFrame implements MouseListener{
	
	private List<Bullet> bullets = new ArrayList<Bullet>();
	
	public Game() {
		setSize(400, 400);
		addMouseListener(this);
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		Bullet bullet = BulletPool.getInstance().nextAvailableBullet();
		bullet.fire();
		
		if(!bullets.contains(bullet)) {
			bullets.add(bullet);
		}
		
		List<Bullet> activeBullets = new ArrayList<Bullet>();
		int counter = 0; 
		for(Bullet b : bullets) {
			if(b.hitWall()) {
				b.deactivate();
			}
			if(b.isActive()) {
				counter++;
			}
		}
		
		System.out.println(counter);
	}
	
	public static void main(String[] args) {
		Game game = new Game();
		game.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
