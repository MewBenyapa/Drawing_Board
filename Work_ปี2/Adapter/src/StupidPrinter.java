
public class StupidPrinter {

	public static void print(String string) {
		System.out.println(string);
	}
	
	public static void main(String[] arg) {
		boolean toBePrint = true;
		StupidPrinter.println(new BooleanToStringAdapter(toBePrint).convert());
	}
	
}
