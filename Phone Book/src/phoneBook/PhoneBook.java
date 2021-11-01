package phoneBook;

import java.util.*;

public class PhoneBook {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhoneBook cache = new PhoneBook();
//        Contacts c1 = new Contacts("Al Simmons", 212-601-1994, "123 Alley Way", "spawn@gmail.com", "Hell Spawn");
//        Contacts c2 = new Contacts("Frank Castle", 212-816-2004, "456 Vendetta Rd.", "thepunisher@gmail.com", "Gun for hire");
//        Contacts c3 = new Contacts("Spider Jerusalem", 212-251-2009, "789 Journalist Lane", "thetruth@gamil.com", "Journalist");
		// Addresses a1 = new Addresses("123 Alley Way", "456 Vendetta Rd.", "789
		// Journalist Lane");

		Contacts c4 = new Contacts("Spider Jerusalem", 2122512009, "transmetro@gmail.com", "Journalist");
		c4.setAddress("789 Truth Lane", "New York", "NY", 12321);
		//c4.setName("Aaron Trigg");
		System.out.println(c4.getName());
		
		Contacts c5 = new Contacts("Frank Castle", 2128162004, "punisher@gmail.com", "Gun for Hire");
		c5.setAddress("456 Vendetta Rd.", "New York", "NY", 32456);
		System.out.println(c5.getName());
		
		Contacts c6 = new Contacts("Al Simmons ", 2126011994, "spawn@gmail.com", "Hell Spawn");
		c6.setAddress("123 Alley Way", "New York", "NY", 23847);
		System.out.println(c6.getName());
		
		Directory d1 = new Directory();
		d1.addContact(c4);
		d1.addContact(c5);
		d1.addContact(c6);
		System.out.println(d1.getContact().toString());
		
		cache.addEntry(c6);
		
		



		int choice = 0;
		while (choice != 3) {
			choice = phoneBookMain();
			switch (choice) {
			case 1:
				Contacts contacts = new Contacts();
				String name = " ";
				String address = "";
				long number = 0;
				String city = "";
				String state = "";
				int zipcode = 0;
				String email = "";
				String association = "";
				contacts.newEntry(name, address, number, city, state, zipcode, email, association);
				System.out.println(contacts.toString());
				break;

			case 2:
				Contacts removeContacts = new Contacts();
				System.out.println("Enter the number to be deleted");
				long case2 = sc.nextLong();
				d1.removeContact(d1.getByPhone(case2));
			case 3:
				System.out.println("Thank you!");
				break;
			case 4:
				
				break;
			default:
				System.out.println("Please enter a number from 1 to 3");
			}
		}

	}

	private void addEntry(Contacts c6) {
		// TODO Auto-generated method stub
		
	}

	public static int phoneBookMain() {
		Scanner sc1 = new Scanner(System.in);
        
		// print menu
		System.out.println("+++++WELCOME TO THE PHONEBOOK APP+++++");
		System.out.println("Enter 1 to add a contact");
		System.out.println("Enter 2 to delete a contact");
		System.out.println("Enter 3 to exit the program");

		// return the int input to the switch case statement
		int choice = sc1.nextInt();
		System.out.println(); // test space
		return choice;

	}
}
