package ArraysAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
//5)Take an array input and find the 2nd max value in that array.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// create a user array
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " elements");

		int ar[] = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		// show the user created array
		System.out.println("Array Created");
		System.out.println(Arrays.toString(ar));

		// calculate the max value
		int max = ar[0]; // give initial reference point within the array
		for (int i = 0; i < n; i++) {
			if (ar[i] > max) {
				max = ar[i];
			}
		}
		
		//calculate the 2nd max value
		int maxTwo = ar[0];//give initial reference point within the array
		int x = 1; //counter used to change the maxTwo initial if the 1st array value makes max and maxTwo same
		//while loop to change the maxTwo initial point
		while (maxTwo == max) {
			maxTwo = ar[x];
			x++;
		}
		//calculate the 2nd max by checking too see it's less than max, and greater than previous high
		for (int i = 0; i < n; i++) {
			if (ar[i] < max && ar[i] > maxTwo) {
				maxTwo = ar[i];
			}
		}
		//display 2nd max
		System.out.println("The 2nd max value of the array is: " + maxTwo);
		

	}

}
