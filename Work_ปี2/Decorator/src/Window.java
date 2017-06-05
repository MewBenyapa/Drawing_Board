import java.awt.FlowLayout;
import java.awt.TextArea;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;

public class Window extends JFrame {

	public Window() {
		/* TextArea textArea = new TextArea();
		JScrollPane pane = new JScrollPane(textArea);
		for(int i = 0; i < 100; i++) {
			textArea.append("Line \n" + (i + 1));
		}
		add(pane);
		pack(); */
		
		setLayout(new FlowLayout());
		/*add(new RedComponent(new JButton("Button")));
		add(new RedComponent(new JLabel("Label")));
		add(new RedComponent(new JSpinner()));
		add(new RedComponent(new JToggleButton()));*/
		add(new JScrollPane(new RedComponent(new CompassComponent(new CompassComponent(new CompassComponent(new JButton("Hello")))))));
		pack();
	}
	
	public static void main(String[] args) {
		Window window = new Window();
		window.setDefaultCloseOperation(EXIT_ON_CLOSE);
		window.setVisible(true);
	}
	
}
