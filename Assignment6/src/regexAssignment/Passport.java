package regexAssignment;

import java.util.Scanner;

public class Passport {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Passport ID: ");
		String input = sc.nextLine();
		System.out.println("You entered: "+input);
		
		if(input.matches("[A-Z]{1}[0-9]{8}")) {
			System.out.println("Valid Passport ID");
		}else {
			System.out.println("Invalid Passport ID");
		}
	}
}
