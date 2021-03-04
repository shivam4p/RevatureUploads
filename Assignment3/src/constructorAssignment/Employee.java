package constructorAssignment;

public class Employee {

	private int id;
	private String name;
	private int age;
	private String email;
	private Address presentAddress;
	private Address permanentAddress;
	private Project projectDetails;
	
	public Employee(int id, String name, int age, String email) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
	}
	
	public Employee(int id, String name, int age, String email, Address presentAddress, Address permanentAddress, Project projectDetails) {
		this(id,name,age,email);
		this.presentAddress=presentAddress;
		this.permanentAddress=permanentAddress;
		this.projectDetails=projectDetails;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", presentAddress="
				+ presentAddress + ", permanentAddress=" + permanentAddress + ", projectDetails=" + projectDetails
				+ "]";
	}
	

	
	
	
	
}
