package ArraysAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
//1)Take an array input and find all the prime numbers from it.
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
		
		System.out.println("\n"+ "Prime numbers in created array:");
		//call the isPrime method to find prime numbers within array
		for (int i = 0; i < n; i++) {
			if(isPrime(ar[i])) {
				System.out.println("ar["+i+"]: " + ar[i]);
			}
		}
		
	}
	//Method to find prime numbers
	public static boolean isPrime(int n) {
		int c=0;
		for (int i = 1; i <=n; i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==2) {
			return true;
		}else {
			return false;
		}
	}
}
