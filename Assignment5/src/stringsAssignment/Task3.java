package stringsAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
// 3)Take a string input and print the characters at prime index to uppercase.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input = sc.nextLine();
		System.out.println("You entered: "+input);
		
		char c[] = input.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (isPrime(i)) {
				c[i].toUpperCase;
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
