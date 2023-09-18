package HomeWork5;

import java.util.List;

public class ContactPresenter implements ContactPresentble{
    private final ContactStorage storage;

    public ContactPresenter(ContactStorage storage) {
        this.storage = storage;
    }
    @Override
    public void addContact(Contact contact) {
        storage.addContact(contact);
    }
    @Override
    public List<Contact> getAllContacts() {
        return storage.getAllContacts();
    }
    @Override
    public void importContacts(String filePath) {
        storage.importContacts(filePath);
    }
    @Override
    public void exportContacts(String filePath) {
        storage.exportContacts(filePath);
    }
}