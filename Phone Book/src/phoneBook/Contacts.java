package phoneBook;

import java.util.Scanner;

//name, number, address, email, association,
public class Contacts {

	private String name;
	private String firstName;
	private String middleName;
	private String lastName;
	private long number;
	private Addresses address;
	private String email;
	private String association;

	// This is the constructor, this acts as sort of an ambassador to other classes
	// giving an explanation on how to use the objects within this class
	public Contacts() {

	}

	public void setAddress(String street, String city, String state, int zip) {
		Addresses temp = new Addresses(street, city, state, zip);
		this.address = temp;
	}

	public Addresses getAddresses() {
		return address;
	}

	// Stricter constructor, we have to follow the format exactly in order to access
	// the class object
	public Contacts(String firstName, String middleName, String lastName, long number, String email,
			String association) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.number = number;
		this.email = email;
		this.association = association;
	}

	public void printDirectoryInfo() {
		if (middleName.length() != 0) {
			System.out.print(firstName + " " + middleName + " " + lastName + " ");
		} else {
			System.out.print(firstName + " " + lastName + " ");
		}
		address.printAddress();
		System.out.print(" " + number + " " + email + " " + association);
		System.out.println();
	}

	public String getName() {
		return firstName + " " + middleName + " " + lastName;

	}

	public void setName(String name) {
		this.name = name;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAssociation() {
		return association;
	}

	public void setAssociation(String association) {
		this.association = association;
	}

//	public String toString() {
//		return "Contacts [name=" + name + ", number=" + number + ", address=" + address + ", email=" + email
//				+ ", association=" + association + "]";
//	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	// public void newEntry(String name, String address, long number, String city,
	// String state, int zipcode, String email, String association) {
//    	Scanner scan = new Scanner(System.in);
//    	
//    	System.out.println("Please input name");
//    	name = scan.nextLine();
//    	this.name = name;
//    	System.out.println("Please input address");
//    	address = scan.nextLine();
//    	System.out.println("Please input number");
//    	number = scan.nextInt();
//    	scan.nextLine();
//    	this.number = number;
//    	System.out.println("Please input city");
//    	city = scan.nextLine();
//    	System.out.println("Please input state");
//    	state = scan.nextLine();
//    	System.out.println("Please input zipcode");
//    	zipcode = scan.nextInt();
//    	scan.nextLine();
//    	System.out.println("Please input email");
//    	email = scan.nextLine();
//    	this.email = email;
//    	System.out.println("Please input association");
//    	association = scan.nextLine();
//    	this.association = association;
//    	setAddress(address, city, state, zipcode);
//    }
//	public void printContactInfo() {
//		System.out.print(firstName + " " + );
//		address.printAddress();
//		System.out.print(" " + number + " " + email + " " + association);
//		System.out.println();
//	}
}
