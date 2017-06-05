import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		List<Font> fonts = new ArrayList<Font>();
		FontData data = new FontData();
		for(int i = 0; i < 10000; i++) {
			fonts.add(new Font('a', data));
		}
	}

}
