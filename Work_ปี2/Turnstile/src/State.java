
public abstract class State {
	
	protected Turnstile turnstile;
	
	public State(Turnstile turnstile) {
		this.turnstile = turnstile;
	}
	
	public void push() {}
	
	public void insertCoin() {}

}
