import java.util.Iterator;

public class ReverseIterator implements Iterator<Item> {
	
	private Item[] items;
	private int index;
	
	public ReverseIterator(Item[] items) {
		this.items = items;
		index = items.length - 1;
	}


	@Override
	public boolean hasNext() {
		return index >= 0;
	}

	@Override
	public Item next() {
		Item item = items[index];
		index--;
		return item;
	}

}
