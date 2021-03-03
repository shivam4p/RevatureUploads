package ArraysAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
//3)Take an array input and find the sum of all even numbers.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//create a user array
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		System.out.println("Enter "+n +" elements");
		
		int ar[]=new int[n];
		for (int i = 0; i < n; i++) {
			ar[i]=sc.nextInt();
		}
		//show the user created array
		System.out.println("Array Created");
		System.out.println(Arrays.toString(ar));
		
		//find the even numbers and calculate the sum
		int evenSum = 0;
		for (int i = 0; i < n; i++) {
			if (ar[i]%2 == 0) {
				evenSum = evenSum + ar[i]; 
			}
		}
		
		//display the results of the even numbers sum
		if (evenSum == 0) {
			System.out.println("\n" + "There are no even numbers so the sum is 0");
		}else {
			System.out.println("\n" + "The sum of the even numbers is: " +evenSum);
		}
	}

}
