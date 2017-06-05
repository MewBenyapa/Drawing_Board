
public class BooleanToStringAdapter {
	
	private boolean bool;
	
	public BooleanToStringAdapter(boolean bool) {
		this.bool = bool;
	}
	
	public String toString() {
		return bool ? "TRUE" : "FALSE";
	}

}
