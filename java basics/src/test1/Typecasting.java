package test1;

public class Typecasting {

	public static void main (String[] args) {
	
	//Widening casting
		
		int a=10;
		float b=a;
	System.out.println(a);
	System.out.println(b);
	
	
	
	float h=9.9f;
	double g=h;
	System.out.println(h);
	System.out.println(g);
	
	long i=123567432790l;
	float j=i;
	System.out.println(i);
	System.out.println(j);
	
	char v=88;
	int y=v;
	System.out.println(v);
	System.out.println(y);
	
	
	
	
	
	//Narrowing casting
	
	float u=10.0f;
	int e=(int)u;
	
	System.out.println(u);
	System.out.println(e);
	
	float x=312234566.1234567f;
	long z=(long)x;
	System.out.println(x);
	System.out.println(z);
	
	int ab=-1302;
	byte fg=(byte)ab;
	
	System.out.println(ab);
	System.out.println(fg );
	
	
	float cd=2.5f;
	long xy=(long)cd;
	
	System.out.println(cd);
	System.out.println(xy);
	
	
	// i want to convert short to char
	short cv=87;
	char de=(char)cv;
	
	System.out.println(cv);
	System.out.println(de);
	
	
	char ef='g';
	int vx=ef;
	System.out.println(ef);
	System.out.println(vx);
	
	byte ds=46;
	char kj=(char)ds;
	
	System.out.println(ds);
	System.out.println(kj);
	
	
	
	
}
}




