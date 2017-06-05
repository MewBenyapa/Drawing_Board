import java.io.BufferedReader;
import java.io.FileReader;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class concurrentCount2 {
	
	static FileReader fr;
	static BufferedReader in;
	static long totalResult = 0;
	
	public static void main(String[] args) {
		
		int processors = Runtime.getRuntime().availableProcessors();
		ForkJoinPool instance = new ForkJoinPool(processors);
		
		try {
			fr = new FileReader("02all.nt");
			in = new BufferedReader(fr);
			
			CountForkJoinTask task = new CountForkJoinTask(24379894);
			
			instance.invoke(task);
			totalResult = task.result;
			
			in.close();
			fr.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Total Result = " + totalResult);
	}
}

class CountForkJoinTask extends RecursiveTask<Long> {
	
	public long result;
	private int n;
	
	public CountForkJoinTask(int n){
		this.n = n;
	}
	
	@Override
	protected Long compute() {
		if (n < 1){
			try {
				String s = concurrentCount2.in.readLine();
				result = (s != null && s.contains("<http://www.w3.org/2001/XMLSchema#string>")) ? 1 : 0;
			} catch (Exception e) {
				e.printStackTrace();
			} 
		} else {
			CountForkJoinTask myWoker1 = new CountForkJoinTask(n / 2);
			CountForkJoinTask myWoker2 = new CountForkJoinTask(n / 2);
			myWoker1.fork();
			result = myWoker2.compute()+myWoker1.join();
		}
		return result;
	}
}
