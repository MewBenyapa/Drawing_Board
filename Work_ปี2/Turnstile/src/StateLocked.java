public class StateLocked extends State {

	public StateLocked(Turnstile turnstile) {
		super(turnstile);
	}
	
	@Override
	public void push() {
		System.out.println("Turnstile is locked. You can't push it.");
	}

	@Override
	public void insertCoin() {
		System.out.println("Unlock turnstile.");
		StateUnlocked unlocked = new StateUnlocked(turnstile);
		turnstile.setState(unlocked);
	}
	
}