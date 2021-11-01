package phoneBook;

public class Addresses extends PhoneBook {

	private String street;
	private String city;
	private String state;
	private int zip;

	public Addresses() {
	}

	public void setContacts(String name, int number, String address, String email, String association) {
		// Contacts temp = new Contacts(name, number, address, email, association);
		// Contacts = temp;
	}

	public Addresses(String street, String city, String state, int zip) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public void printAddress() {
		System.out.print(street + ", " + city + ", " + state + ", " + zip);
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Addresses [name=" + street + ", city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}

}
