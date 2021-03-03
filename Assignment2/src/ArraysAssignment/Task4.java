package ArraysAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
//4)Take an array input and find the max value and min value from that array.
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
		
		//calculate the min value
		int min = ar[0]; //give initial reference point within the array
		for (int i = 0; i < n; i++) {
			if(ar[i] < min) {
				min = ar[i];
			}
		}
		
		//calculate the max value
		int max = ar[0]; //give initial reference point within the array
		for (int i = 0; i < n; i++) {
			if(ar[i] > max) {
				max = ar[i];
			}
		}
		
		//display the min and max result
		System.out.println("The min value of the array is: " + min);
		System.out.println("The max value of the array is: " + max);
		
	}

}
