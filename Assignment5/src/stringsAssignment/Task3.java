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
		String s1[] = input.split("");
		
		for (int i = 0; i < s1.length; i++) {
			if (isPrime(i)) {
				System.out.println(i + " is prime so the index character there is uppercase: "+ s1[i].toUpperCase());
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
