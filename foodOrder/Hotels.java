package foodOrder;

import java.util.Scanner;

public class Hotels extends A2BHotel{
	
	public void Hotelname() {
		
		boolean hotels= false;
		
		String hotelsname = null;
		
		String[] hotelnames = {"A2B","SARAVANA BHAVAN","RK RESTAURANT","DK RESTAURANT"};	
		
		for (String name:hotelnames) {
			
			System.out.println(name);
			
		}
		
		System.out.println("ENTER THE HOTEL NAMES GIVEN ABOVE : ");
	
	    for(int i=0; i < 3; i++) {
	    	
	    	Scanner value = new Scanner(System.in);
	    	
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
	    	
	    }
	    
	    if(hotels && hotelsname.equalsIgnoreCase("SARAVANA BHAVAN")) {
	    	
	    	new SARAVANABHAVAN().FoodItems();
	    	
	    }
	    
	    if(hotels && hotelsname.equalsIgnoreCase("RK RESTAURANT")) {
	    	
	    	new RKRESTAURANT().FoodItems();
	    	
	    }
	    
	    if(hotels && hotelsname.equalsIgnoreCase("DK RESTAURANT")) {
	    	
	    	new DKRESTAURANT().FoodItems();
	    	
	    }
	    
	    }
	    
	}
	
	public static void main (String[] args) {
		
		new Hotels().Hotelname();
		
	}

}
