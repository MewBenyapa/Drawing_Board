import java.util.Iterator;

public class NormalIterator implements Iterator<Item> {
	
	private Item[] items;
	private int index;
	
	public NormalIterator(Item[] items) {
		this.items = items;
		index = 0;
	}

	@Override
	public boolean hasNext() {
		return index < items.length;
	}

	@Override
	public Item next() {
		Item item = items[index];
		index++;
		return item;
	}
	
	

}
