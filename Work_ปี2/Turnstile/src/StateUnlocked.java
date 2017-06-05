public class StateUnlocked extends State {

	public StateUnlocked(Turnstile turnstile) {
		super(turnstile);
	}

	@Override
	public void push() {
		System.out.println("Turnstile is pushed, now it becomes locked.");
		StateLocked locked = new StateLocked(turnstile);
		turnstile.setState(locked);
	}

	@Override
	public void insertCoin() {
		System.out.println("Turnstile is already unlocked. No need to insert more coins.");
	}
	
}