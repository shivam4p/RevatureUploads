package constructorAssignment;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Project p1 = new Project(102, "Security", "Mr.Tim");
		Address a1_permanent = new Address(98989, "Oakly Live Street", "Houston", "TX", 77000);
		Address a1_present = new Address(46778, "Forest Hills Dr.", "Chicago", "IL", 48958);
		
		Employee e1 = new Employee(256, "Shivam Patel", 23, "shivam200710@yahoo.com", a1_present, a1_permanent, p1);
		System.out.println(e1);
	}
			
}
