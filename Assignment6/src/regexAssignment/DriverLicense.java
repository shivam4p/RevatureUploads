package regexAssignment;

import java.util.Scanner;

public class DriverLicense {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Drivers License number: ");
		String input = sc.nextLine();
		System.out.println("You entered: "+input);
		
		//checks if the license is numbers and 8 digits long
		if(input.matches("[0-9]{8}")) {
			System.out.println("Valid Driver License");
		}else {
			System.out.println("Invalid Driver License");
		}
	}
}
