package endless.model;

public abstract class State {

	protected Player player;
	
	public State(Player player) {
		this.player = player;
	}
	
	public void jumpPressed() {}
	
	public void crawlPressed() {}
	
	public void crawlReleased() {}
	
}
