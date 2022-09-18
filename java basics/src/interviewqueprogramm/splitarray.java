package interviewqueprogramm;

public class splitarray {

	public static void main(String[]args) {
		
		//count the number of words in string
	
	String s= "hard work is the key to success";
	String words[]= s.split("\\s");
	System.out.println(words.length);
		
	
	
	
	//to print the  words reverse order
	
	for(int i=words.length-1;i>=0;i--) {
		System.out.println(words[i]);
		
	}
	//to print the all words in reverse order
	
	String h="hello java is the programming language";
	String temp= " ";
    for(int i=h.length()-1;i>=0;i--) {
    	temp=temp+h.charAt(i);
    
    }
 String p[]=temp.split("\\s");
 for (int i=p.length-1; i>=0;i--) {
  System.out.print(p[i]+" ");
}

	
	}
	
}
