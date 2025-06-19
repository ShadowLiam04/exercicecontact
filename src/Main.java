public class Main {
    public static void main(String[] args) {
        // 1. Créez un objet ContactsManager
        ContactsManager myContactsManager = new ContactsManager();

        // 2. et 3. Créez et ajoutez 5 contacts
        Contact contact1 = new Contact("Alice Dupont", "0612345678");
        myContactsManager.addContact(contact1);

        Contact contact2 = new Contact("Bob Martin", "0787654321");
        myContactsManager.addContact(contact2);

        Contact contact3 = new Contact("Charlie Dubois", "0601020304");
        myContactsManager.addContact(contact3);

        Contact contact4 = new Contact("Diana Lefevre", "0778899001");
        myContactsManager.addContact(contact4);

        Contact contact5 = new Contact("Eve Bernard", "0655443322");
        myContactsManager.addContact(contact5);

        // 4. Recherchez un contact et affichez son numéro de téléphone
        String searchName = "Charlie Dubois";
        Contact foundContact = myContactsManager.searchContact(searchName);

        if (foundContact != null) {
            System.out.println("Numéro de téléphone de " + searchName + " : " + foundContact.getPhoneNumber());
        } else {
            System.out.println("Contact " + searchName + " non trouvé.");
        }
    }
}