public class Main {
    public static void main(String[] args) {
        ContactsManager myContactsManager = new ContactsManager();
        myContactsManager.addContact(new Contact("Aidar", "996554910551"));
        myContactsManager.addContact(new Contact("Daniyar", "996707910551"));
        myContactsManager.addContact(new Contact("Pamir", "0701222002"));
        myContactsManager.searchContact("Daniyar");
    }
}
