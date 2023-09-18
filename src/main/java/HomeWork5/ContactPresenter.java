package HomeWork5;

import java.util.List;

public class ContactPresenter{
    private ContactRepository repository;

    public ContactPresenter(ContactRepository repository) {
        this.repository = repository;

    }
    public void addContact(Contact contact) {
        repository.addContact(contact);
    }
    public List<Contact> getAllContacts() {
        return repository.getAllContacts();
    }
    public void size(){
        repository.size();
    }

    public void importContacts(String filePath) {
        repository.importContacts(filePath);
    }

    public void exportContacts(String filePath) {
        repository.exportContacts(filePath);
    }
}