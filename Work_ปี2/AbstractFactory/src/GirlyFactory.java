import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class GirlyFactory implements ThemeFactory {

	@Override
	public JPanel makePanel() {
		return new JPanel() {
			{
			 setBackground(Color.pink);
			}	
		};
	}

	@Override
	public JLabel makeLabel(String text) {
		return new JLabel(text) {
			{
				setForeground(Color.white);
			}	
		};
	}
}
