package stringStringBufferStringBuilderAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
//1)Take a sentence as input and convert all the last chars to upper case of every word
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String s = sc.nextLine();
		String ar[] = s.split(" ");
		
		StringBuilder sb = new StringBuilder();
		int lastDigit;
		
		for (int i = 0; i < ar.length; i++) {
			lastDigit = (ar[i].length()-1);
			sb.append(ar[i].substring(0, lastDigit)).append(Character.toUpperCase(ar[i].charAt(lastDigit))).append(" ");
		}
		System.out.println(sb.toString().trim());
	}
}
