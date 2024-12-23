package internetBanking;

import java.time.LocalDate;

import java.util.HashSet;

import java.util.Scanner;

public class UserID extends RAJID{
	
	boolean User = false;
	
	String names = null;
	
	Scanner name = new Scanner(System.in);
	
	public void userid() {
	
		LocalDate date = LocalDate.now();
		
		System.out.println("DATE :"+date);
		
		HashSet<String> id = new HashSet<>();
		
		id.add("raj171@ikbank");
		
		id.add("agash666@ikbank");
		
		id.add("sathish333@ikbank");
		
		id.add("ravi123@ikbank");
		
		System.out.println("ENTER YOUR USERID :");
		
		for(int i=0; i<3; i++) {
			
			String value = name.nextLine();
			
		for(String ID:id) {
			
		if (value.equals(ID)) {
			
			names = ID;
				
			User = true;
			
			break;
				
			}
		}
		
		if (User==true) {
			
			System.out.println();
			
		}
		
		else if (User==false) {
			
			System.out.println("INCORRECT USERID");
			
		}
		
		if(User &&  names.equals("raj171@ikbank")) {
			
			BorW();
			
			break;
			
		}
		
		if(User && names.equals("agash666@ikbank")) {
			
			new AgashID().BorW();
			
			break;
			
		}
		
		if(User && names.equals("sathish333@ikbank")) {
			
			new SathishID().BorW();
			
			break;
			
		}
		
		if(User && names.equals("ravi123@ikbank")) {
			
			new RaviID().BorW();
			
			break;
			
		}
			
		}
		
		name.close();
		
	}
	
	public static void main(String[] args) {
		
		new UserID().userid();
		
	}

}
