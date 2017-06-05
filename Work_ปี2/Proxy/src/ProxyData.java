
public class ProxyData implements Data, Runnable {
	
	private SlowData slowData;
	private String url;
	private boolean loading = false;
	
	public ProxyData(String url) {
		this.url = url;
	}
	
	public String toString() {
		if(slowData == null) {
			if(loading) {
				loading = true;
				Thread t = new Thread(this);
				t.start();
			}
			return "Loading";
		} else {
			return slowData.toString();
		}
	}

	@Override
	public void run() {
		slowData = new SlowData(url);
	}

}
