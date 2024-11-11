package com;
import java.util.ArrayList;
import java.util.List;



public class Travel {
	public boolean isCarDriver(Driver driver) {
		if(driver.getCategory().equalsIgnoreCase("Car")) return true;
		else return false;
	}
	
	public String RetrivebyDriverId(ArrayList<Driver> drivers, int driverId) {
		for(Driver driver : drivers) {
			if(driver.getDriverId()== driverId) {
				return "Driver name is "+driver.getDriverName()+"belongs to the category of"+driver.getCategory()+"travelled"+driver.getTotalDistance()+"KM so far";
			}
		}
		return "driver not found";
		
	}
	public int RetriveCountOfDrivers(ArrayList<Driver> count,String Category) {
		int c=0;
		for(Driver counts : count ) {
			if(counts.getCategory().equals(Category)) {
				c++;
			}
		}
		return c;
		
	}
	public ArrayList<Driver> retriveDriver(ArrayList<Driver> driver,String Category){
		ArrayList<Driver> result = new ArrayList<>();
		for(Driver d : driver) {
			if(d.getCategory().equals(Category)) {
				result.add(d);
			}
		}
		return  result;
	}
	public Driver RetriveMaximunDistanceTravelledDriver(ArrayList<Driver> distance){
        if (distance.isEmpty()) return null;
        
        Driver maxDistanceDriver = distance.get(0);
        for (Driver driver : distance) {
            if (driver.getTotalDistance() > maxDistanceDriver.getTotalDistance()) {
                maxDistanceDriver = driver;
            }
        }
        return maxDistanceDriver;
		
	}
	

}

