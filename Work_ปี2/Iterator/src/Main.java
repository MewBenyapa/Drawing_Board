
public class Main {

	public static void main(String[] args) {
		Bag bag = new Bag();
//		for(int i = 0; i < bag.getItem().length; i++) {
//			System.out.println(bag.getItem()[i]);
//		}
		
		for(Item item : bag) {
			System.out.println(item);
		}
		
		System.out.println("----------------------------");
		ReverseIterator r = new ReverseIterator(bag.getItem());
		while(r.hasNext()) {
			System.out.println(r.next());
		}
		
	}
	
}
