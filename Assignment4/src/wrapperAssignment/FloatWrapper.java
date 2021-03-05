package wrapperAssignment;

public class FloatWrapper {

	public static void main(String[] args) {
		Float f1=10.25f;
		Float f2=10.25f;
		Float f3=new Float(10.25f);
		
		System.out.println("f1==f2 : "+(f1==f2));
		System.out.println("f1==f3 : "+(f1==f3));
		
		System.out.println("(f1.equals(f2)) : "+(f1.equals(f2)));
		System.out.println("(f1.equals(f3)) : "+(f1.equals(f3)));
		
		
		System.out.println(System.identityHashCode(f1));
		System.out.println(System.identityHashCode(f2));
		System.out.println(System.identityHashCode(f3));
		
		f2++;
		System.out.println(System.identityHashCode(f2));
		
		
		float x=f2;   //auto boxing -> obj to primitive
		System.out.println("x = "+x);
		x=7.25f;
		f2=x; 
		System.out.println("f2 = "+f2);

	}

}
