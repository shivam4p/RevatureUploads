package regexAssignment;

import java.util.Scanner;

public class SocialSecurity {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Social Security Number: ");
		String input = sc.nextLine();
		System.out.println("You entered: "+input);
		
		
		if(input.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}")) {
			System.out.println("Valid Social Security Number");
		}else if (input.length() == 9){
			System.out.println("Enter Social Security Number With \"-\" ");
		}else {
			System.out.println("Invalid Social Security Number");
		}
	}
}
