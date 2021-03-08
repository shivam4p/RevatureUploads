package stringStringBufferStringBuilderAssignment;

import java.util.Scanner;

public class Task3 {
//3)Take a sentence as input and print the word with maximum letters and also print the word with minimum letters.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String s = sc.nextLine();
		String ar[] = s.split(" ");
		
		//initial flags to test against
		int maxLetters = ar[0].length();
		int minLetters = ar[0].length();
		
		String max = ar[0];
		String min = ar[0];
		
		for (int i = 0; i < ar.length; i++) {
			//System.out.println(ar[i].length());
			if(ar[i].length() > maxLetters) {
				max = ar[i];
				maxLetters = ar[i].length();
				//System.out.println("max updated " + ar[i]);
			}
			if(ar[i].length() < minLetters) {
				min = ar[i];
				minLetters = ar[i].length();
				//System.out.println("min updated " + ar[i]);
			}
			
		}
		
		
		
		System.out.println("The word with the max letters is: "+ max);
		System.out.println("The word with the min letters is: "+ min);
	}
}
