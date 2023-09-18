package HomeWork5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ContactRepository {
    private List<Contact> contacts = new ArrayList<Contact>();
    public void size(){
        contacts.size();
    }
    public void addContact(Contact contact){
        contacts.add(contact);
    }
    public List<Contact> getAllContacts(){
        return contacts;
    }
    public void importContacts(String filePath){
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String name = parts[0];
                    String phoneNumber = parts[1];
                    String address = parts[2];
//                    if(address.equals(" ")||address.equals("")){
//                        address = "Адресс не введен";
//                    }
                    Contact contact = new Contact(name, phoneNumber, address);
                    contacts.add(contact);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void exportContacts(String filePath){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Contact contact : contacts) {
                String line = contact.getName() + "," + contact.getPhoneNumber() + "," + contact.getAddress();
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
