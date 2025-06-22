public class Main {
    public static void main(String[] args) {
        ContactsManager myContactsManager = new ContactsManager();

        Contact contact1 = new Contact("Mathieu Kouakou", "0612345678");
        myContactsManager.addContact(contact1);

        Contact contact2 = new Contact("Jean charles", "0787654321");
        myContactsManager.addContact(contact2);

        Contact contact3 = new Contact("franck kouassi", "0601020304");
        myContactsManager.addContact(contact3);

        Contact contact4 = new Contact("Diana Berthe", "0778899001");
        myContactsManager.addContact(contact4);

        Contact contact5 = new Contact("Eve ouattara", "0655443322");
        myContactsManager.addContact(contact5);

        String searchName = "Eve ouattara";
        Contact foundContact = myContactsManager.searchContact(searchName);

        if (foundContact != null) {
            System.out.println("Numéro de téléphone de " + searchName + " : " + foundContact.getPhoneNumber());
        } else {
            System.out.println("Contact " + searchName + " non trouvé.");
        }
    }
}