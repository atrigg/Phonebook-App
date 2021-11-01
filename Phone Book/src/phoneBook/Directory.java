package phoneBook;

public class Directory {
// Create an array of Contacts
	Contacts[] bookings = new Contacts[0];

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
		System.out.println();
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
			str[i] = alphabet[i].getName();

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
				if (str[i] == bookings[j].getName()) {
					bookings[j].printContactInfo();
				}

			}

		}

	}
}
