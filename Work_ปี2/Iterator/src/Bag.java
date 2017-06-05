import java.util.Iterator;

public class Bag implements Iterable<Item> {
	
	private Item[] items;
	
	public Bag() {
		items = new Item[5];
		items[0] = new Item("Item 0", 4);
		items[1] = new Item("Item 1", 13);
		items[2] = new Item("Item 2", 7);
		items[3] = new Item("Item 3", 3);
		items[4] = new Item("Item 4", 8);
 	}
	
	public Item[] getItem() {
		return items;
	}
	
	public Iterator<Item> iterator() {
		return new NormalIterator(items);
	}

}
