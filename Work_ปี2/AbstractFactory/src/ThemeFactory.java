import javax.swing.JLabel;
import javax.swing.JPanel;

public interface ThemeFactory {
	
	public JPanel makePanel();
	public JLabel makeLabel(String text);

}
