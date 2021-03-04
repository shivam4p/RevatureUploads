package constructorAssignment;

public class Address {

	private int aid;
	private String streetName;
	private String city;
	private String state;
	private int zip;
	
	public Address(int aid, String streetName, String city, String state, int zip) {
		this.aid = aid;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", streetName=" + streetName + ", city=" + city + ", state=" + state + ", zip="
				+ zip + "]";
	}
	
	
}
