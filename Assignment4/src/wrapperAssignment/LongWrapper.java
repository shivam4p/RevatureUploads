package wrapperAssignment;

public class LongWrapper {

	public static void main(String[] args) {
		Long l1=100000000000000L;
		Long l2=100000000000000L;
		Long l3=new Long(100000000000000L);
		
		System.out.println("l1==l2 : "+(l1==l2));
		System.out.println("l1==l3 : "+(l1==l3));
		
		System.out.println("(l1.equals(l2)) : "+(l1.equals(l2)));
		System.out.println("(l1.equals(l3)) : "+(l1.equals(l3)));
		
		
		System.out.println(System.identityHashCode(l1));
		System.out.println(System.identityHashCode(l2));
		System.out.println(System.identityHashCode(l3));
		
		l2++;
		System.out.println(System.identityHashCode(l2));
		
		
		long x=l2;   //auto boxing -> obj to primitive
		System.out.println("x = "+x);
		x=7000000000000000000L;
		l2=x; 
		System.out.println("l2 = "+l2);
	}
}
