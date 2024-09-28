package foodOrder;

public class Tax {
	
	double taxamount = 0.1;
	
	public void taxcal(int amount) {
		
		double taxvalue = taxamount*amount;
		
		double acutalamount = taxvalue+amount;
		
		System.out.println("TAX AMOUNT IS Rs. "+taxvalue);
		
		System.out.println("YOUR ACUTAL AMONUNT Rs. "+acutalamount);
		
	}

}
