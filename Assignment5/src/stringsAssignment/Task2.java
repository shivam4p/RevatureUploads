package stringsAssignment;

import java.util.Scanner;

public class Task2 {
//2)Take a string input and print true if all vowels are present in it else print false.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input = sc.nextLine();
		System.out.println("You entered: "+input);
		
		//lowercase vowels flag
		int Lowera = 0;
		int Lowere = 0;
		int Loweri = 0;
		int Lowero = 0;
		int Loweru = 0;
		//uppercase vowels flag
		int UpperA = 0;
		int UpperE = 0;
		int UpperI = 0;
		int UpperO = 0;
		int UpperU = 0;
		
		//for loop going through each char of string, checks to see if vowel present, 
		//if present the flag changes to 1
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == 'a') {
				Lowera = 1;
			}else if (input.charAt(i) == 'e') {
				Lowere = 1;
			}else if (input.charAt(i) == 'i') {
				Loweri = 1;
			}else if (input.charAt(i) == 'o') {
				Lowero = 1;
			}else if (input.charAt(i) == 'u') {
				Loweru = 1;
			}else if (input.charAt(i) == 'A') {
				UpperA = 1;
			}else if (input.charAt(i) == 'E') {
				UpperE = 1;
			}else if (input.charAt(i) == 'I') {
				UpperI = 1;
			}else if (input.charAt(i) == 'O') {
				UpperO = 1;
			}else if (input.charAt(i) == 'U') {
				UpperU = 1;
			}else {
				
			}
		}
		
		// checks the flags if either the upper or lowercase is 1 for all vowels.  
		if((Lowera == 1 || UpperA == 1) && (Lowere == 1 || UpperE == 1) && (Loweri == 1 || UpperI == 1) && (Lowero == 1 || UpperO == 1) && (Loweru == 1 || UpperU == 1)) {
			System.out.println("All vowels present within string");
		}else {
			System.out.println("Not all vowels present within string");
		}
	}
}
