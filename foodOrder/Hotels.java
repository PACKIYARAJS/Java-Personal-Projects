package foodOrder;

import java.time.LocalDate;

import java.time.LocalTime;

import java.util.Scanner;

public class Hotels extends A2BHotel{
	
	Scanner value = new Scanner(System.in);
	
	public void Hotelname() {
		
		boolean hotels= false;
		
		String hotelsname = null;
		
		String[] hotelnames = {"A2B","SARAVANA BHAVAN","RK RESTAURANT","DK RESTAURANT"};
		
        LocalDate date = LocalDate.now();
        
        LocalTime time= LocalTime.now();
        
        System.out.println("DATE :"+date);
        
        System.out.println("TIME :" + time);
		
		for (String name:hotelnames) {
			
			System.out.print(name +", ");
			
		}
		
		System.out.println();
		
		System.out.println("ENTER THE HOTEL NAMES GIVEN ABOVE : ");
	
	    for(int i=0; i < 3; i++) { 	
	    	
	        String hname = value.nextLine();
	        
	    for (String name:hotelnames) {
	    	
	    	if (hname.equalsIgnoreCase(name)) {
	    		
	    	 hotelsname = name;
	    		
	    	 hotels= true; 
	    	 
	    	 break;
	    		
	    	}
	    	
	    }	
	    
	    if(hotels==true) {
	    	
	    	System.out.println();	
	    		
	    }
	    	
	    if(hotels==false) {
	    	
	    	System.out.println("ENTER NAME OF HOTEL IN GIVEN ABOVE");	
	    		
	    }
	    
	    if(hotels && hotelsname.equalsIgnoreCase("A2B")) {
	    	
	    	FoodItems();
	    	
	    	break;
	   
	    }
	    
	    if(hotels && hotelsname.equalsIgnoreCase("SARAVANA BHAVAN")) {
	    	
	    	new SARAVANABHAVAN().FoodItems();
	    	
	    	break;
	    	
	    }
	    
	    if(hotels && hotelsname.equalsIgnoreCase("RK RESTAURANT")) {
	    	
	    	new RKRESTAURANT().FoodItems();
	    	
	    	break;
	    	
	    }
	    
	    if(hotels && hotelsname.equalsIgnoreCase("DK RESTAURANT")) {
	    	
	    	new DKRESTAURANT().FoodItems();
	    	
	    	break;
	    	
	    }
	      
	    }
	    
	    value.close();
	    
	}
	
	public static void main (String[] args) {
		
		new Hotels().Hotelname();
		
	}

}
