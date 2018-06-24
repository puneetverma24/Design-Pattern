package FactoryMethod;

public class Auto implements Vehicle{

	@Override
	public void price() {
		
	System.out.println("Rs 1,00,000");
	}

	@Override
	public void type() {
		System.out.println("Three Tyre");
		
	}

}
