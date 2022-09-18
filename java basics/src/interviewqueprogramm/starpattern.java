package interviewqueprogramm;

public class starpattern {

	public static void main(String[]args) {
	//int n=5;
		
		//right triangle star pattern
		for(int i=0; i<=4; i++) {
  			for(int j=0; j<=i; j++) {
				System.out.print("*"+" ");
			}
		
		    System.out.println(" ");
			}
		
		//left triangle star pattern
		for(int i=0; i<=4; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print(" ");
			}
		
		for(int j=0; j<=i;j++) {
			System.out.print("*");
		}
		System.out.println(" ");
		}
		
		//Downward triangle star pattern
		
		for(int i=4; i>=0; i--) {
	      for(int j=0; j<=i; j++) {
	    System.out.print("*");	  
	      }
		System.out.println(" ");
		}
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
