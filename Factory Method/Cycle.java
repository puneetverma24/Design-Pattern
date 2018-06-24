package FactoryMethod;

public class Cycle implements Vehicle{
	
	@Override
	public void price() {
		
	System.out.println("Rs 1,000");
	}

	@Override
	public void type() {
		System.out.println("Two Tyre");
		
	}

}
