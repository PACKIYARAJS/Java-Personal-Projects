package foodOrder;

import java.util.Scanner;

public class Invoice extends Tax{
	
	public void Calculation(int quantity) {
		
		System.out.println("ENTER THE QUANTITY OF FOOD ITEMS : ");
		
		Scanner q = new Scanner(System.in);
		
		int value = q.nextInt();
		
		int Price = value * quantity;
		
		System.out.println("FOOD ITEM AMOUNT Rs. "+Price);
		
		taxcal(Price);
		
	}

}
