package conditionBlocks;

public class ifelsehomewoerk {

	
	public static void main(String[]args) {
		
		int studentmarks=86;
		
		if(studentmarks>=90) {
		System.out.println("distinction");
		
		}else if(studentmarks>=70&&studentmarks<90) {
			System.out.println("firstClass");
			
		}else if(studentmarks>=45&&studentmarks<70) {
			
			System.out.println("pass");
		}
			else {
			System.out.println("fail");
			}
		}
}
