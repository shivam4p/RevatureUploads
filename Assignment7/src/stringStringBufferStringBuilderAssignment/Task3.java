package stringStringBufferStringBuilderAssignment;

import java.util.Scanner;

public class Task3 {
//3)Take a sentence as input and print the word with maximum letters and also print the word with minimum letters.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String s = sc.nextLine();
		String ar[] = s.split(" ");
		
		int maxLetters = ar[0].length();
		int minLetters = ar[0].length();
		
		//StringBuilder sb = new StringBuilder();
		String max = ar[0];
		String min = ar[0];
		
		for (int i = 0; i < ar.length; i++) {
			if(ar[i].length() > maxLetters) {
				max = ar[i];
			}else if(ar[i].length() < minLetters) {
				min = ar[i];
			}else {
				
			}
		}
		
		System.out.println("The word with the max letters is: "+ max);
		System.out.println("The word with the min letters is: "+ min);
	}
}
