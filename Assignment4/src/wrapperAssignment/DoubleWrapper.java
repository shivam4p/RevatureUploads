package wrapperAssignment;

public class DoubleWrapper {

	public static void main(String[] args) {
		Double d1=10.5;
		Double d2=10.5;
		Double d3=new Double(10.5);
		
		System.out.println("d1==d2 : "+(d1==d2));
		System.out.println("d1==d3 : "+(d1==d3));
		
		System.out.println("(d1.equals(d2)) : "+(d1.equals(d2)));
		System.out.println("(d1.equals(d3)) : "+(d1.equals(d3)));
		
		
		System.out.println(System.identityHashCode(d1));
		System.out.println(System.identityHashCode(d2));
		System.out.println(System.identityHashCode(d3));
		
		d2++;
		System.out.println(System.identityHashCode(d2));
		
		
		double x=d2;   //auto boxing -> obj to primitive
		System.out.println("x = "+x);
		x=7.5;
		d2=x; 
		System.out.println("d2 = "+d2);
	}
}
