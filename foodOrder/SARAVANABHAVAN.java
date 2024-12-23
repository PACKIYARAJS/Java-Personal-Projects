package foodOrder;

import java.util.LinkedList;

import java.util.Scanner;

public class SARAVANABHAVAN extends Invoice{
	
    boolean fooditems = false;
	
	int quantity = 0;
	
	Scanner value = new Scanner(System.in);
	
	public void FoodItems(){
		
		LinkedList<String> Items = new LinkedList<>();
		
		Items.add("TEA-12");
		
		Items.add("COFFEE-15");
		
		Items.add("MILK-10");
		
		Items.add("PADAM MILK-15");
		
		Items.add("BOOST-15");
		
		for (String Iname:Items) {
			
			System.out.println(Iname);
			
		}
		
		System.out.println("ENTER THE FOOD ITEMS GIVEN ABOVE :");
		
		for(int i=0; i<3;i++) {
			
			String iname = value.nextLine();
			
		for (String name:Items) {
			
			String[] aftersplit = name.split("-");
			
		if(iname.equalsIgnoreCase(aftersplit[0])) {
			
			fooditems = true;
			
			int quantity = Integer.parseInt(aftersplit[1]);
			
			Calculation(quantity);
			
		   }
			
	   }
	 	
	    if(!fooditems) {
		
		   System.out.println("ENTER GIVEN ABOVE FOOD ITEMS");
		   
		   continue;
		
	    }	
	    
	    break;
	
     }
		
		value.close();

   }
	
}	
