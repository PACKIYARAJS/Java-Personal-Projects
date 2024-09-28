package foodOrder;

import java.util.HashSet;

import java.util.Scanner;

public class RKRESTAURANT extends Invoice{
	
    boolean fooditems = false;
	
	int quantity = 0;
	
	public void FoodItems(){
		
		HashSet<String> Items = new HashSet<>();
		
		Items.add("CHICKEN BRIYANI-200");
		
		Items.add("MUTTON BRIYANI-250");
		
		Items.add("CHICKEN RICE-120");
		
		Items.add("CHICKEN TANDOORI-400");
		
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
