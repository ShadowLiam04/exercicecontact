import java.util.ArrayList;

public class ContactsManager {
    ArrayList<Contact> myContacts;

    public ContactsManager() {
        myContacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        myContacts.add(contact);
    }

    public Contact searchContact(String name) {
        for (Contact contact : myContacts) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null; // Contact not found
    }
}