package phoneBook;

import java.util.*;

public class PhoneBook {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//PhoneBook cache = new PhoneBook();
//        Contacts c1 = new Contacts("Al Simmons", 212-601-1994, "123 Alley Way", "spawn@gmail.com", "Hell Spawn");
//        Contacts c2 = new Contacts("Frank Castle", 212-816-2004, "456 Vendetta Rd.", "thepunisher@gmail.com", "Gun for hire");
//        Contacts c3 = new Contacts("Spider Jerusalem", 212-251-2009, "789 Journalist Lane", "thetruth@gamil.com", "Journalist");
		// Addresses a1 = new Addresses("123 Alley Way", "456 Vendetta Rd.", "789
		// Journalist Lane");

		Contacts c1 = new Contacts("Spider", "", "Jerusalem", 2122512009, "transmetro@gmail.com", "Journalist");
		c1.setAddress("789 Truth Lane", "New York", "NY", 12321);
		// c4.setName("Aaron Trigg");
		System.out.println(c1.getName());

		Contacts c2 = new Contacts("Frank", "", "Castle", 2128162004, "punisher@gmail.com", "Gun for Hire");
		c2.setAddress("456 Vendetta Rd.", "New York", "NY", 32456);
		System.out.println(c2.getName());

		Contacts c3 = new Contacts("Al", "", "Simmons", 2126011994, "spawn@gmail.com", "Hell Spawn");
		c3.setAddress("123 Alley Way", "New York", "NY", 23847);
		System.out.println(c3.getName());

		Directory d1 = new Directory();
		d1.addContact(c1);
		d1.addContact(c2);
		d1.addContact(c3);
		//System.out.println(d1.getContact().toString());

		//cache.addEntry(c6);

		int choice = 0;
		while (choice != 6) {
			choice = phoneBookMain();
			switch (choice) {
			case 1:
			System.out.println("Enter a new contact in the following format.");
			System.out.println("Full name, street address, city, state abbreviation, zipcode, phone number, email, association." );
			String newContactEntry = sc.nextLine();
			String[] newContactArray = newContactEntry.split(", ");
			String fullName = newContactArray[0];
			String address = newContactArray[1];
			String city = newContactArray[2];
			String state = newContactArray[3];
			int zipCode = Integer.parseInt(newContactArray[4]);
			Long number = Long.parseLong(newContactArray[5]);
			String email = newContactArray[6];
			String association = newContactArray[7];
			String[] nameSplit = fullName.split(" ");
            String firstName = nameSplit[0];
            String lastName = nameSplit[nameSplit.length - 1];
            String middleName = "";
            for (int i = 1; i < nameSplit.length - 1; i++) {
            	middleName += nameSplit[i];
            	if(i != nameSplit.length - 2) {
            		middleName += " ";
            	}
				
			}
            Contacts newContacts = new Contacts(firstName, middleName, lastName, number, email, association);
            d1.addContact(newContacts);
            newContacts.setAddress(address, city, state, zipCode);
				break;

			case 2:
				Contacts removeContacts = new Contacts();
				System.out.println("Enter the number to be deleted");
				long case2 = sc.nextLong();
				d1.removeContact(d1.getByPhone(case2));
				break;
			case 3:
//				Contacts alphabeticalContacts = new Contacts();
                d1.getByAlphabet(d1.getContact());
				break;

			case 4:
				int searchBy = 0;
				while (searchBy != 7) {
					searchBy = searchMenu();
					Scanner input = new Scanner(System.in);
					switch (searchBy) {
					
					
				case 1:
					System.out.println("Please enter the First Name of the contact you are looking for: ");
					String searchValue = input.next();
					input.nextLine();
					d1.getByAlphabet(d1.searchFirstName(searchValue));
					//d1.getContact().getFirstName(searchValue);
					//cache.searchByName(searchValue);
					//menuChoice = 0;
					break;
					
				case 2:
					System.out.println("Please enter the Last Name of the contact you are looking for: ");
					searchValue = input.next();
					input.nextLine();
					//d1.setName(searchValue);
					//cache.searchByName(searchValue);
					//menuChoice = 0;
					break;
					
				case 3:
					System.out.println("Please enter the Full Name of the contact you are looking for: ");
					searchValue = input.nextLine();
					//d1.setFullName(searchValue);
					//cache.addEntry(searchValue);
					//menuChoice = 0;
					break;
					
				case 4:
					System.out.println("Enter the phone number of the contact you would like to search:");
					long search4 = sc.nextLong();
					System.out.println();
					d1.getByPhone(search4).printDirectoryInfo();
					break;

					
				case 5:
					System.out.println("Please enter the City of the contact you are looking for: ");
					searchValue = input.nextLine();
					//d1.setStreetAddress(searchValue);
					//d1.setCity(searchValue);
					//cache.searchByCity(searchValue);
					//menuChoice = 0;
					break;
					
				case 6:
					System.out.println("Please enter the State of the contact you are looking for: ");
					searchValue = input.nextLine();
					//d1.setStreetAddress(searchValue);
					//d1.setState(searchValue);
					//cache.searchByState(searchValue);
					//menuChoice = 0;
					break;
                
				case 7:
					break;
					
					}
				break;
				
			} 
				break;
			case 5:
				System.out.println("Enter a number to update a contact:");
				long searchNumber = sc.nextLong();
				int updateBy = 0;
				while (updateBy != 9) {
					updateBy = updateMenu();
					switch (updateBy) {
					case 1:
						System.out.println("Please enter a name.");
						String newName = sc.next();
						d1.getByPhone(searchNumber).setName(newName);
						break;

					case 2:
						System.out.println("Please enter a street address.");
						String newStreet = sc.next();
						d1.getByPhone(searchNumber).getAddresses().setStreet(newStreet);
						break;

					case 3:
						System.out.println("Please enter a city.");
						String newCity = sc.next();
						d1.getByPhone(searchNumber).getAddresses().setCity(newCity);
						break;

					case 4:
						System.out.println("Please enter a state.");
						String newState = sc.next();
						d1.getByPhone(searchNumber).getAddresses().setState(newState);
						break;

					case 5:
						System.out.println("Please enter a zipcode.");
						int newZip = sc.nextInt();
						d1.getByPhone(searchNumber).getAddresses().setZip(newZip);
						break;

					case 6:
						System.out.println("Please enter a phone number.");
						long newNumber = sc.nextLong();
						d1.getByPhone(searchNumber).setNumber(newNumber);
						break;

					case 7:
						System.out.println("Please enter an email.");
						String newEmail = sc.next();
						d1.getByPhone(searchNumber).setEmail(newEmail);
						break;

					case 8:
						System.out.println("Please enter an association.");
						String newAssociation = sc.next();
						d1.getByPhone(searchNumber).setAssociation(newAssociation);
						break;

					case 9:
						break;

					}
				}

			case 6:
				System.out.println("Thank you!");

				break;
			default:
				System.out.println("Please enter a number from 1 to 6");
			}
		}

	}

	//private void addEntry(Contacts c6) {
		// TODO Auto-generated method stub

	//}

	public static int phoneBookMain() {
		Scanner sc1 = new Scanner(System.in);

		// print menu
		System.out.println("+++++WELCOME TO THE PHONEBOOK APP+++++");
		System.out.println("Enter 1 to add a contact");
		System.out.println("Enter 2 to delete a contact");
		System.out.println("Enter 3 to show contacts");
		System.out.println("Enter 4 to search function");
		System.out.println("Enter 5 to update");
		System.out.println("Enter 6 to exit the program");

		// return the int input to the switch case statement
		int choice = sc1.nextInt();
		System.out.println(); // test space
		return choice;

	}

	public static int updateMenu() {
		// once
		Scanner input2 = new Scanner(System.in);
		int choice = 0;
		System.out.println("Update Menu \nPlease choose from the following options: ");
		System.out.println("1. Update name");
		System.out.println("2. Update street address");
		System.out.println("3. Update city.");
		System.out.println("4. Update state.");
		System.out.println("5. Update zip code.");
		System.out.println("6. Update phone number.");
		System.out.println("7. Update email.");
		System.out.println("8. Update association. ");
		System.out.println("9. Return to main menu.");
		choice = input2.nextInt();
		System.out.println();
		return choice;
	}

	public static int searchMenu() {
		Scanner input3 = new Scanner(System.in);
		int choice = 0;
		System.out.println("Search Menu \nPlease choose from the following options: ");
		System.out.println("1. Search by first name");
		System.out.println("2. Search by last name");
		System.out.println("3. Search by full name");
		System.out.println("4. Search by city.");
		System.out.println("5. Search by state.");
		System.out.println("6. Search by phone number.");
		System.out.println("7. Return to main menu.");
		choice = input3.nextInt();
		System.out.println();
		return choice;
	}
}
