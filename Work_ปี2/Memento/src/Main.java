
public class Main {
	
	public static void main(String[] args) {
		ComplicatedEngine e = new ComplicatedEngine();
		
		e.process();
		e.inspect();
		
		ComplicatedEngine.Memento m = e.save();
		
		e.process();
		e.inspect();
		
		e.load(m);
		
		
	}

}
