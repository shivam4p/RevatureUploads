package stringStringBufferStringBuilderAssignment;

import java.util.Scanner;

public class Task2 {
//2)Take a sentence as input and for the word with length odd convert the middle character to 
//uppercase and for the word length even convert the first character to uppercase.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String s = sc.nextLine();
		String ar[] = s.split(" ");
		
		int wordLength = 0;
		int oddMiddle = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ar.length; i++) {
			wordLength = ar[i].length();
			if (wordLength%2 == 0) {
				sb.append(Character.toUpperCase(ar[i].charAt(0))).append(ar[i].substring(1)).append(" ");
			}else {
				oddMiddle = (wordLength/2);// dont need to subtract 1 because it will be refer to index  
				sb.append(ar[i].substring(0, oddMiddle)).append(Character.toUpperCase(ar[i].charAt(oddMiddle))).append(ar[i].substring(oddMiddle+1)).append(" ");
			}
		
		}
		System.out.println(sb.toString().trim());
	}
}
