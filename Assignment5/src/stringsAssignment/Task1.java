package stringsAssignment;

import java.util.Scanner;

public class Task1 {
//1)Take a string input from user and find the count of vowels(aeiouAEIOU) in it.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input = sc.nextLine();
		System.out.println("You entered: "+input);
		
		int vowelCounter = 0;
		
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == 'a') {
				vowelCounter = vowelCounter + 1;
			}else if (input.charAt(i) == 'e') {
				vowelCounter = vowelCounter + 1;
			}else if (input.charAt(i) == 'i') {
				vowelCounter = vowelCounter + 1;
			}else if (input.charAt(i) == 'o') {
				vowelCounter = vowelCounter + 1;
			}else if (input.charAt(i) == 'u') {
				vowelCounter = vowelCounter + 1;
			}else if (input.charAt(i) == 'A') {
				vowelCounter = vowelCounter + 1;
			}else if (input.charAt(i) == 'E') {
				vowelCounter = vowelCounter + 1;
			}else if (input.charAt(i) == 'I') {
				vowelCounter = vowelCounter + 1;
			}else if (input.charAt(i) == 'O') {
				vowelCounter = vowelCounter + 1;
			}else if (input.charAt(i) == 'U') {
				vowelCounter = vowelCounter + 1;
			}else {
				vowelCounter = vowelCounter;
			}
		}
		
		System.out.println("The number of vowels in string is: "+ vowelCounter);
		
	}

}
