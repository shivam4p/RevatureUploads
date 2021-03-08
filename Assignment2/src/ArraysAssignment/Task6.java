package ArraysAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
//6)Perform CRUD operations on Array
	public static void main(String[] args) {
		int ar[]=new int[6];
		ar[0]=1;
		ar[1]=2;
		ar[2]=3;
		ar[3]=4;
		int n=4; //use n to keep track of elements in array
		System.out.println("Before Insertion");
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i]+" ");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nWhat new element value do you want to enter");
		int ele = Integer.parseInt(sc.nextLine());
		int pos = 5;
		
		for(int i=n;i>pos-1;i--) {
			ar[i]=ar[i-1];   //updating
		}
		ar[pos-1]=ele; //inserting 
		n++;
		
		System.out.println("\nAfter Insertion");
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i]+" ");
		}
		
		
		System.out.println("\nWhich position do you want to delete");
		int delpos = Integer.parseInt(sc.nextLine());
		for (int i = delpos-1; i < n; i++) {
			ar[i]=ar[i+1];
		}
		n--;
		System.out.println("\nAfter Deletion from positon "+delpos);
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i]+" ");
		}
		
		
	}

}
