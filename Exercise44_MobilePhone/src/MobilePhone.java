import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String phoneNumber) {

        this.myNumber = phoneNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    private int findContact(Contact contact1){
        for (Contact contact : this.myContacts){
            if(contact.getName().equals(contact1.getName())) return myContacts.indexOf(contact);
        }
        return -1;
    }

    private int findContact(String name){
        for (Contact contact : this.myContacts){
            if(contact.getName().equals(name)){
                return myContacts.indexOf(contact);
            }
        }
        return -1;
    }

    public Contact queryContact(String name){
        if(this.findContact(name) < 0) return null;
        System.out.println(findContact(name));
        return this.myContacts.get(findContact(name));
    }

    public boolean addNewContact(Contact contact){
        if(this.findContact(contact) >= 0) return false;
        this.myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact existingContact, Contact updatedContact){
        if(this.findContact(existingContact) >= 0) {
            this.removeContact(existingContact);
            this.addNewContact(updatedContact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact){
        if(this.findContact(contact) < 0) return false;
        this.myContacts.remove(this.findContact(contact));
        return true;

//        int foundPosition = findContact(contact);
//        if(foundPosition <0) {
//            System.out.println(contact.getName() +", was not found.");
//            return false;
//        }
//        this.myContacts.remove(foundPosition);
//        System.out.println(contact.getName() + ", was deleted.");
//        return true;
    }

    public boolean removeContact(String name){
        if(this.findContact(name) < 0  || name == null) return false;
        this.myContacts.remove(this.findContact(name));
        return true;
    }

    public void printContacts(){
        System.out.println("Contact List:");
        for(Contact contact : this.myContacts){
            System.out.println(this.myContacts.indexOf(contact) + 1 + ". "
                    + contact.getName() + " -> " + contact.getPhoneNumber());
        }

    }
}
