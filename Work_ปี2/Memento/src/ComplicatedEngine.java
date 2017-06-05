import java.util.Random;

public class ComplicatedEngine {
	
	private int complicatedState;
	
	public ComplicatedEngine() {
		complicatedState = 0;
	}
	
	public void process() {
		complicatedState = new Random().nextInt(100);
	}
	
	public void inspect() {
		System.out.println("So complicated " + complicatedState);
	}
	
	public Memento save() {
		return new Memento(complicatedState);
	}
	
	public void load(Memento m) {
		complicatedState = m.getSavedState();
	}

	public static class Memento {
		
		private int savedState;
		
		private Memento(int state) {
			this.savedState = state;
		}
		
		private int getSavedState() {
			return savedState;
		}
		
	}
	
}
