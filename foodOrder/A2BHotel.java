package foodOrder;

import java.util.ArrayList;

import java.util.Scanner;

public class A2BHotel extends Invoice{
	
	boolean fooditems = false;
	
	int quantity = 0;
	
	public void FoodItems(){
		
		ArrayList<String> Items = new ArrayList<>();
		
		Items.add("IDLY-8");
		
		Items.add("VADA-6");
		
		Items.add("POORI-10");
		
		Items.add("PONGAL-30");
		
		Items.add("DOSA-15");
		
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
		
		   System.out.println("ENTER GIVEN ABOVE FOOD ITEMS");
		   
	   }	
	
    }
		
}
	
	public static void main(String[] args) {
		
		new A2BHotel().FoodItems();
		
	}

}
