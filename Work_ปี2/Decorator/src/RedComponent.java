import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class RedComponent extends JComponent {

	private JComponent component;
	
	public RedComponent(JComponent component) {
		this.component = component;
		this.setLayout(new BorderLayout());
		this.add(component);
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		int height = this.getHeight();
		int width = this.getWidth();
		g.fillRect(0, 0, width, height);
		super.paint(g);
	}
	
}
