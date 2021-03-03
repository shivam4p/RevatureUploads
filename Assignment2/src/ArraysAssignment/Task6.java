package ArraysAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
//6)Perform CRUD operations on Array
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
		//read the user created array
		System.out.println("Array Created");
		System.out.println(Arrays.toString(ar));

		//Update the user created array by changing the odd numbers to 0
		for (int i = 0; i < n; i++) {
			if(!(ar[i]%2==0)) {
				ar[i] = 0;
			}
			
		}
		
		System.out.println("Updated array with odd numbers changed to 0");
		System.out.println(Arrays.toString(ar));
	}

}
