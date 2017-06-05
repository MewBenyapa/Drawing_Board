import java.io.BufferedReader;
import java.io.FileReader;
import java.util.concurrent.ConcurrentHashMap;


public class concurrentCount3 {
	
	static ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
	static FileReader fr;
	static BufferedReader in;

	public static void main(String[] args) {
		
		long result = 0;

		try {
			fr = new FileReader("02all.nt");
			in = new BufferedReader(fr);

			int size = Integer.parseInt(in.readLine());
			for (int i = 0; i < size; i++){
				map.put(i, in.readLine());
				if(i > 0 && i % 1000000 == 0) {
					result += count(map);
					map.clear(); 
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		result += count(map);
		System.out.println(result);
	}
	
	private static long count(ConcurrentHashMap<Integer, String> map) {
		long total = (long) map.reduceValuesToLong(
				4,
				(value) ->  { 
					return (value.contains("<http://www.w3.org/2001/XMLSchema#string>")) ? 1 : 0;
				}, 0,
				(x1, x2) -> {
					return  x1 + x2;
				});
		return total;
	}
	
}
