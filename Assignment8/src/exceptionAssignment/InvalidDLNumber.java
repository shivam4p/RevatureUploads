package exceptionAssignment;
//Create a BusinessException(unchecked) and use it for handling for invalid DL number.
public class InvalidDLNumber extends RuntimeException {

	public InvalidDLNumber() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InvalidDLNumber(final String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	
}
