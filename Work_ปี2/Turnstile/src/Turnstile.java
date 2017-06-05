public class Turnstile {

	private State state;
	
	public Turnstile() {
		state = new StateLocked(this);
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public void push() {
		state.push();
	}
	
	public void insertCoin() {
		state.insertCoin();
	}
	
	public static void main(String[] args) {
		Turnstile t = new Turnstile();
		t.push();
		t.push();
		t.push();
		t.insertCoin();
		t.insertCoin();
		t.insertCoin();
		t.push();
		t.push();
		t.push();
		t.insertCoin();
		t.insertCoin();
		t.insertCoin();
	}
	
}