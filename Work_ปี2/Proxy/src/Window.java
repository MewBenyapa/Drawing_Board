import javax.swing.JFrame;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Window extends JFrame {
	
	private DefaultListModel<Data> data = new DefaultListModel<Data>();
	
	private JList<Data> list = new JList<Data>(data);
	
	private JScrollPane pane = new JScrollPane(list);
	
	public Window() {
		for(int i = 0; i < 100; i++) {
			data.addElement(new ProxyData("www.slow.com/" + i));
		}
		add(list);
		pack();
	}
	
	public static void main(String[] arg) {
		Window window = new Window();
		window.setDefaultCloseOperation(EXIT_ON_CLOSE);
		window.setVisible(true);
	}

}
