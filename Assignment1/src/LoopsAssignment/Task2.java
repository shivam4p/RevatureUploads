package LoopsAssignment;

import java.util.Scanner;

public class Task2 {
//2)Print all the palindrome numbers between 100 and 999
	public static void main(String[] args) {
		
		//Now able to enter palindrome range
		Scanner sc = new Scanner(System.in);
		//starting palindrome value
		System.out.println("Enter starting palindrome range: ");
		int start = Integer.parseInt(sc.nextLine());
		
		//ending palindrome value
		System.out.println("Enter ending palindrome range: ");
		int end = Integer.parseInt(sc.nextLine());
		
		//checks if the ending value range is less than the start, if so asks user to reenter new value
		while(end <= start) {
			System.out.println("Enter new ending palindrome range that's greater than " + start + ":");
			end = Integer.parseInt(sc.nextLine());
		}
		
		//runs through the range to check for palindromes
		System.out.println("\n" + "The following are the palindromes in the range of "+ start + " to " + end +":");
		for(int i = start; i <= end; i ++) {
			if(Palindrome(i)) {
				System.out.println(i+ " ");
			} 
		}
	}
		
	public static boolean Palindrome(int num) {
		int originalNum = num; // stores original number
		int reverseNum = 0;
		//loops through the num given to get the reverse
		while(num!=0) {
			reverseNum = reverseNum*10 + num%10; //loops though the original number and begins flipping
			num = num/10; // reduces num by 10s place (div eliminates int decimal) to begin store of that number, unless num gets to 0
		}
		
		if(originalNum == reverseNum) {
			return true;
		}else {
			return false;
		}
	}

}
