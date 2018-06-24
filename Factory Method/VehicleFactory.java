package FactoryMethod;

public class VehicleFactory {
	
	
	public Vehicle getVehicle(String vehicleType)
	{
		
		if(vehicleType==null)
		{
			return null;
			
		}
		
	     if(vehicleType.equals("Auto"))
	     {
	    	 return new Auto();
	    	 
	     }
	
	     if(vehicleType.equals("Car"))
	     {
	    	 return new Car();
	     }
	
	     if(vehicleType.equals("Cycle"))
	     {
	    	 return new Cycle();
	     }
	     
	     
		      
		      return null;
     }
		
	}
	
	
	
	
	


