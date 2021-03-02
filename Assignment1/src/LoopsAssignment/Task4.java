package LoopsAssignment;

public class Task4 {
	/* 4)Find the sum of all even numbers between 1 and 100, also find sum
	 of all odd numbers between 1 and 100 and print the results and
     print which is largest among them(between evensum and oddsum) */ 

	public static void main(String[] args) {
		int evensum = 0;
		int oddsum = 0;
		for (int i = 1; i <= 100; i++) {
			if(i%2==0) {
				evensum = evensum + i;
			}else {
				oddsum = oddsum + i;
			}
		}
		
		System.out.println("The sum of all even numbers is: " +evensum);
		System.out.println("The sum of all odd numbers is: " +oddsum);
		
		if (evensum > oddsum) {
			System.out.println("The even numbers sum is larger");
		}else {
			System.out.println("The odd number sum is larger");
		}
	}

}
