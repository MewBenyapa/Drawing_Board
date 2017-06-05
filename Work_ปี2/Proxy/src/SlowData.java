
public class SlowData implements Data {
	
	private String url;
	private String content;
	
	public SlowData(String url) {
		this.url = url;
		
		try{
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		this.content = "Content from : " + url;
	}
	
	public String toString() {
		return content;
	}

}
