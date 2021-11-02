package phoneBook;

public class Directory {
// Create an array of Contacts
	Contacts[] bookings = new Contacts[0];
	// Contacts[] stored = new Contacts[0];

	// public void addNewContactRecord(Contacts newNumbers) {
	// Contacts temp[] = new Contacts[stored.length + 1];
	// for (int i = 0; i < stored.length; i++) {
	// temp[i] = stored[i];
	// }
	// temp[temp.length - 1] = newNumbers;
	// stored = temp;
	// }

	public void addContact(Contacts newContact) {
		// Create new array, one larger than current array
		Contacts[] temp = new Contacts[bookings.length + 1];
		// Add people in the original array to the temp array
		for (int i = 0; i < bookings.length; i++) {
			temp[i] = bookings[i];

		}
		// Add new person to the end of the temp array
		temp[temp.length - 1] = newContact;
		// Reassign original array to new array
		bookings = temp;
		//System.out.println();
	}

	public Contacts[] getContact() {
		return bookings;
	}

	public void removeContact(Contacts removeContacts) {
		Contacts[] temp = new Contacts[bookings.length - 1];
		int x = 0;
		for (int i = 0; i < bookings.length; i++) {
			if (bookings[i] != removeContacts) {
				temp[x] = bookings[i];
				x++;
			}
		}
		bookings = temp;
	}

	public Contacts getByPhone(long phoneNumber) {
		// Bring up a contact by phone number
		int count = 0;
		// for loop to find the specific phone number we want to update in our original
		// array
		for (int i = 0; i < bookings.length; i++) {
			if (bookings[i].getNumber() == phoneNumber) {
				count = i;
				break;
			}

		}
		return bookings[count];
	}

	public void getByAlphabet(Contacts[] alphabet) {
		String[] str = new String[alphabet.length];
		for (int i = 0; i < alphabet.length; i++) {
			str[i] = alphabet[i].getFirstName();

		}
		String temp;
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[j].compareTo(str[i]) < 0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;

				}

			}
		}
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < bookings.length; j++) {
				if (str[i] == bookings[j].getFirstName()) {
					bookings[j].printDirectoryInfo();
				}

			}

		}

	}

	public void searchByFirstName(String input) {
		boolean check = false;
		for (int i = 0; i < bookings.length; i++) {
			if (bookings[i].getName().toLowerCase().equals(input.toLowerCase())) {
				check = true;
				bookings[i].getNumber();
			} else {
			}
		}
		if (!check) {
			System.out.println("Invalid first name");
		}
	}

	public void searchByLastName(String input) {
		boolean check = false;
		for (int i = 0; i < bookings.length; i++) {
			if (bookings[i].getName().toLowerCase().equals(input.toLowerCase())) {
				bookings[i].getNumber();
				check = true;
			} else {
			}
		}
		if (!check) {
			System.out.println("Invalid last name");
		}
	}

	public void searchByFullName(String input) {
		boolean check = false;
		for (int i = 0; i < bookings.length; i++) {
			if (bookings[i].getName().toLowerCase().equals(input.toLowerCase())) {
				check = true;
				bookings[i].getNumber();
			}
		}
		if (!check) {
			System.out.println("Invalid full name");
		}
	}

//	//public void searchByAnyOfContactsPhoneNumbers(long input) {
//		//boolean check = false;
//		for (int i = 0; i < bookings.length; i++) {
//			if (!bookings[i].getNumber().equals(input) {
//				check = true;
//				bookings[i].getNumber();
//			}
//		}

	// else

	// {
	// check = true;
	// stored[i].getNumber();
	// }
	// }
	// if(!check){System.out.println("Invalid phone, mobile or fax number");}}

	public void searchByCity(String input) {
		boolean check = false;
		for (int i = 0; i < bookings.length; i++) {
			if (!bookings[i].getName().toLowerCase().equals(input.toLowerCase())) {
				if (bookings[i].getName().toLowerCase().equals(input.toLowerCase())) {
					check = true;
					bookings[i].getNumber();
				}
			} else {
				check = true;
				bookings[i].getNumber();
			}
		}
		if (!check) {
			System.out.println("Invalid City");
		}
	}

	public void searchByState(String input) {
		boolean check = false;
		for (int i = 0; i < bookings.length; i++) {
			if (!bookings[i].getName().toLowerCase().equals(input.toLowerCase())) {
				if (bookings[i].getName().toLowerCase().equals(input.toLowerCase())) {
					check = true;
					bookings[i].getNumber();
				}
			} else {
				check = true;
				bookings[i].getNumber();
			}
		}
		if (!check) {
			System.out.println("Invalid State");
		}
	}

	public Contacts searchByNumber(long number) {
		// Bring up a contact by phone number
		int count = 0;
		// for loop to find the specific phone number we want to update in our original
		// array
		for (int i = 0; i < bookings.length; i++) {
			if (bookings[i].getNumber() == number) {
				count = i;
				break;
			}

		}
		return bookings[count];
	}
	public Contacts[] searchFirstName(String searchFirst) {
		// Counting instances found of first name in contacts AND display an array of
		// just the found first names
		int count = 0;
		// for loop to find the number of people with the searched first name for the
		// new array
		for (int i = 0; i < bookings.length; i++) {
			if (bookings[i].getFirstName().equals(searchFirst)) {
				count++;
			}
		}
		// Create a new array of persons with the size of count
				Contacts[] temp = new Contacts[count];
				int x = 0;
				// makes sure that our array has space for all instances of the first name found
				for (int i = 0; i < bookings.length; i++) {
					if (bookings[i].getFirstName().equals(searchFirst)) {
						temp[x] = bookings[i];
						x++;
					}
				}
				return temp;

	}
}
