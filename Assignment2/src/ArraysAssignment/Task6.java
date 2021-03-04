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
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
			
		}

		//Update the user created array
		System.out.println("\n \n"+"Enter new element to put into array: ");
		int elem = sc.nextInt();
		System.out.println("What postition will element replace: ");
		int pos = sc.nextInt();
		
		ar[pos-1] = elem;
		System.out.println("New Array:");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
			
		}
		
		//delete an element and move the array if necessary
		System.out.println("\n \n"+"Enter position of element to be deleted: ");
		int delpos = sc.nextInt();
		
		ar[delpos-1] = 0;
		for (int i = delpos-1; i < ar.length+1; i++) {
			ar[i]=ar[i+1];
		}
		System.out.println("New Array:");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
			
		}
		
		
	}

}
