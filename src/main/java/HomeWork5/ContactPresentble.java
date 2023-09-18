package HomeWork5;

import java.util.List;

public interface ContactPresentble {
    void addContact(Contact contact);
    List<Contact> getAllContacts();
    void importContacts(String filePath);
    void exportContacts(String filePath);
}
