package FactoryMethod;

public class Client {
	
	
public static void main(String[] args)
{
	
	VehicleFactory factory=new VehicleFactory();
	
	
	Vehicle car=factory.getVehicle("Car");
	System.out.println("Car");
	car.type();
	car.price();
	
	System.out.println("xxxxxxxxxxxxxxxxxxxxxxx");
	Vehicle cycle=factory.getVehicle("Cycle");
	System.out.println("Cycle");
	cycle.type();
	cycle.price();
	
	System.out.println("xxxxxxxxxxxxxxxxxxxxxxx");
	Vehicle auto=factory.getVehicle("Auto");
	System.out.println("Auto");
	auto.type();
	auto.price();
	

}
	
	

}
