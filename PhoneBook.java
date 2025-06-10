import java.util.HashMap;
import java.util.Scanner;
public class PhoneBook {
    private HashMap<String, String> contacts;
	public PhoneBook() {
        contacts = new HashMap<>();
    }
    public void addContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
        System.out.println("Contact added/updated successfully.");
    }
    public String searchContact(String name) {
        return contacts.get(name);
    }
    public void displayAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Phone book is empty.");
            return;
        }
        System.out.println("Contacts:");
        for (String name : contacts.keySet()) {
            System.out.println(name + ": " + contacts.get(name));
        }
    }
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
		while (true) {
            System.out.println("\nPhone Book Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Display All Contacts");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
			int choice = scanner.nextInt();// 
            scanner.nextLine(); 
			switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phone = scanner.nextLine();
                    phoneBook.addContact(name, phone);
                    break;
                case 2:
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    String number = phoneBook.searchContact(searchName);
                    if (number != null) {
                        System.out.println("Phone number of " + searchName + " is " + number);
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 3:
                    phoneBook.displayAllContacts();
                    break;
                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}