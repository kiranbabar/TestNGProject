package array;

public class stringoperations {

	public static void main(String[] args) {
		
	String name="Rahul";
	String temp="";
	
	for (int i=name.length()-1; i>=0; i--) {
	temp=temp+name.charAt(i);
	
	}
	
	System.out.println(temp);
	
	
	
	
	for (int i=0; i<=100; i++) {
		 
		if(i%2==1) {
		System.out.println(i+"odd number");	
			
		}
	
		else {
			System.out.println(i+"not even number" );
		}
	}
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
}