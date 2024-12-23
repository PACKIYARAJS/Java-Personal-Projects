package internetBanking;

import java.util.Scanner;

public class SathishID {
	
	private int Passcode= 135791;
	
	private int amount = 50000;
	
	Scanner u = new Scanner(System.in);
	
	public void BorW() {
		
		System.out.println("Enter the Passcode :");
		
		for(int i=0; i<3; i++) {
		
		int code = u.nextInt();
		
		if(code == Passcode) {
		
		System.out.println("1.Check Balance \n2.Withdraw");
		
	    int number = u.nextInt();
	    
	    if(number==1) {
	    	
	    	Balance();
	    	
	    }
	    
	    else if(number ==2) {
	    	
	    	Withdraw();
	    	
	    }
	    
	    break;
	    
		}
		
		else {
			
			System.out.println("Incorrect passcode");
			
		}
	    
		}
		
	}
	
	
	public void Balance() {
		
		System.out.println("Your balance amount is Rs. "+amount);
		
	}
	
	
	
	public void Withdraw() {
		
		for(int i=0; i<3; i++) {
			
			int otp = (int) (Math.random()*900000)+100000;
			
			System.out.println("Enter the OTP :"+otp);
			
			int otpn = u.nextInt();
			
			if(otpn==otp) {
			
				System.out.println("Enter the amount :");
			
				int value =u.nextInt();
		
			if(value<amount) {
			
				int ba = amount - value;
			
				System.out.println("Successfully withdraw amount Rs."+value);
			
				System.out.println("If you want to check your balance \n Yes or No");
				
				u.nextLine();
				
				String select = u.nextLine(); 
				
			if(select.equalsIgnoreCase("yes")) {
			
				System.out.println("Your balance amount is Rs."+ba);
				
			}
				
				break;
			
			}
			
			else System.out.println("Invalid amount");
			
			}
			
			else {
				
				System.out.println("Incorrect OTP");
				
			}
			
		}
		
	}

}
