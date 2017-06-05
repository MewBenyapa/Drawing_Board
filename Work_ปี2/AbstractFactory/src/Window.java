import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Window extends JFrame {
	
	public Window(ThemeFactory tFactory) {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = tFactory.makePanel();
		JLabel label = tFactory.makeLabel("Hello");
		panel.add(label);
		
		add(panel);
		pack();
		
	}

}
