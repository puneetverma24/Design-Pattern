package FactoryMethod;

public class Car implements Vehicle {
	@Override
	public void price() {
		
	System.out.println("Rs 5,00,000");
	}

	@Override
	public void type() {
		System.out.println("Four Tyre");
		
	}

}
