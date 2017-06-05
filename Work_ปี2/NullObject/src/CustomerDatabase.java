import java.util.ArrayList;
import java.util.List;

public class CustomerDatabase {
	
	public static Customer loadCustomerForView(int id) {
		List<Customer> db = new ArrayList<Customer>();
		db.add(new Customer(1, "Tom"));
		db.add(new Customer(2, "Tim"));
		db.add(new Customer(3, "Tam"));
		db.add(new Customer(4, "Tum"));
		db.add(new Customer(5, "Toom"));
		
		for(Customer c : db) {
			if(c.getId() == id) {
				return c;
			}
		}
		//return new NullCustomer();
	}
	
	public static void main(String[] args) {
		System.out.println(loadCustomerForView(1).getName());
	}

}
