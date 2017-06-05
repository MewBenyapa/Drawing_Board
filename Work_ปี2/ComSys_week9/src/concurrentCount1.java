import java.io.BufferedReader;
import java.io.FileReader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class concurrentCount1 {

	static FileReader fr;
	static BufferedReader in;
	static long result = 0;

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() + 1);

		try {
			fr = new FileReader("02all.nt");
			in = new BufferedReader(fr);
			String line;

			while((line = in.readLine()) != null) {
				String nextLine = line;
				result += executor.submit(() -> (nextLine.contains("<http://www.w3.org/2001/XMLSchema#string>")) ? 1 : 0).get();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Total Result = " + result);
		executor.shutdown();
	}

}
