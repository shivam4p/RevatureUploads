package exceptionAssignment;

import java.util.Scanner;

public class BusinessMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Passport Number: ");
		String ppn = sc.nextLine();
		System.out.println("Enter Your Drivers License Number: ");
		String dln = sc.nextLine();
		
		Validators v = new Validators();
		try {
			if(v.isValidPassport(ppn)) {
				System.out.println("Passport Number Validated.");
			}
		} catch (InvalidPassportNumber e) {
			System.out.println(e.getMessage());
		}
		
		try {
			if(v.isValidDL(dln)) {
				System.out.println("Drivers License Validated.");
			}
		} catch (InvalidDLNumber e) {
			System.out.println(e.getMessage());
		}
	}
}
