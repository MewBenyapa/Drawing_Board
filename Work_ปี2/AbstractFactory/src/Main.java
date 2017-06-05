
public class Main {
	public static void main() {
		
		Window window = new Window(new GirlyFactory());
		window.setVisible(true);
		
		Window window2 = new Window(new DarkFactory());
		window2.setVisible(true);
	}
}
