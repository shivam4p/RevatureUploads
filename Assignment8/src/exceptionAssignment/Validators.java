package exceptionAssignment;

public class Validators {

	public boolean isValidPassport(String number) throws InvalidPassportNumber {
		 if(!number.matches("[A-Z]{1}[0-9]{8}")) {
			throw new InvalidPassportNumber("Invalid Passport Number");
		 }

		 return true;

	}

	public boolean isValidDL(String DLNum) {
		if(!DLNum.matches("[0-9]{8}")) {
			throw new InvalidDLNumber("Invalid Driver License");
	}
		return true;

    }
	
		
}