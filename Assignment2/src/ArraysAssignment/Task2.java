package ArraysAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
//2)Take an array input and find all the palindrome numbers from it.
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
		
		System.out.println("\n"+ "Palindrome numbers in created array:");
		//Call the Palindrome method to find the palindrome numbers within created array
		for(int i = 0; i < n; i ++) {
			if(Palindrome(ar[i])) {
				System.out.println("ar["+i+"]: " + ar[i]);
			}
		}

	}
	
	public static boolean Palindrome(int num) {
		int originalNum = num; // stores original number
		int reverseNum = 0;
		
		while(num!=0) {
			reverseNum = reverseNum*10 + num%10; //loops though the original number and begins flipping
			num = num/10; // reduces num by 10s place (div eliminates remainder) to begin store of that number, unless num gets to 0
		}
		
		if(originalNum == reverseNum) {
			return true;
		}else {
			return false;
		}
	}

}
