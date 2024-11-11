package com;

import java.util.ArrayList;
import java.util.List;

public class TestDriver {

  public static void main(String[] args) {
	  ArrayList<Driver> drivers = new ArrayList<>();
	  Driver d1 = new Driver("lorry", 1, "Srinu", 10.3);
	  Driver d2 = new Driver("car", 2, "Narendra", 100.13);
	  Driver d3 = new Driver("lorry", 3, "Durga", 89.3);
	  Driver d4 = new Driver("Car", 4, "Sita", 97.0);
	  Travel t = new Travel();
	  
		
		boolean res = t.isCarDriver(d1);
		System.out.println(res);
		
		drivers.add(d1);
		drivers.add(d2);
		drivers.add(d3);
		drivers.add(d4);
		
		String res2 = t.RetrivebyDriverId(drivers, 4);
		System.out.println(res2);
		
		int res3 = t.RetriveCountOfDrivers(drivers, "car");
		System.out.println(res3);
		
		List<Driver> res4 = t.retriveDriver(drivers, "lorry");
		System.out.println(res4);
		
		Driver res5 = t.RetriveMaximunDistanceTravelledDriver(drivers);
		System.out.println(res5);
		
	}
 
}
