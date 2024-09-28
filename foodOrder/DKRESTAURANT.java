package foodOrder;

import java.util.TreeSet;

import java.util.Scanner;

public class DKRESTAURANT extends Invoice{
	
boolean fooditems = false;
	
	int quantity = 0;
	
	public void FoodItems(){
		
		TreeSet<String> Items = new TreeSet<>();
		
		Items.add("PAROTTA-15");
		
		Items.add("NAN-15");
		
		Items.add("CHILLY CHICKEN-150");
		
		Items.add("BUTTER CHICKEN-150");
		
		Items.add("PEPPER CHICKEN-100");
		
		for (String Iname:Items) {
			
			System.out.println(Iname);
			
		}
		
		System.out.println("ENTER THE FOOD ITEMS GIVEN ABOVE :");
		
		for(int i=0; i<3;i++) {
			
			Scanner value = new Scanner(System.in);
			
			String iname = value.nextLine();
			
		for (String name:Items) {
			
			String[] aftersplit = name.split("-");
			
		if(iname.equalsIgnoreCase(aftersplit[0])) {
			
			fooditems = true;
			
			int quantity = Integer.parseInt(aftersplit[1]);
			
			Calculation(quantity);
			
			break;
			
		   }
			
	   }
		
	if(fooditems==false) {
		
		System.out.println("no");
		
	   }	
	
    }
		
  }

}
