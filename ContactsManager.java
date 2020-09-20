import java.util.ArrayList;

public class ContactsManager {
    private ArrayList<Contact> contacts = new ArrayList<>();
    public ContactsManager(){
    }
    public void addContact(Contact contact){
        contacts.add(contact);
    }
    public void searchContact(String name){
        for(Contact i: contacts){
            if(i.getName().equals(name)){
                System.out.println(i.getPhonenumber());
            }
         }
    }
}
