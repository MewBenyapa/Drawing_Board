
public interface IFooBuilder {

	public Foo build();
	
	public IFooBuilder A(int a);
	public IFooBuilder B(String b);
	public IFooBuilder C(float c);
	public IFooBuilder D(boolean d);
	
}
