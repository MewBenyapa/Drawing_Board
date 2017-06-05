
public class FooBuilder implements IFooBuilder {
	
	Foo foo;

	@Override
	public Foo build() {
		return new Foo();
	}

	@Override
	public IFooBuilder A(int a) {
		foo.setA(a);
		return this;
	}

	@Override
	public IFooBuilder B(String b) {
		foo.setB(b);
		return this;
	}

	@Override
	public IFooBuilder C(float c) {
		foo.setC(c);
		return this;
	}

	@Override
	public IFooBuilder D(boolean d) {
		foo.setD(d);
		return this;
	}

}
