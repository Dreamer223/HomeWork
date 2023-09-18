package HomeWork5;

import java.util.List;
import java.util.Scanner;

public class ContactView {
    private ContactPresenter presenter;
    private Scanner scanner = new Scanner(System.in);
    public void setPresenter(ContactPresenter presenter) {
        this.presenter = presenter;
    }

    public void displayMenu() {
        System.out.println("Контакты\n" +
                "Выберите действие: \n" +
                "1 Показать все контакты\n" +
                "2 Добавить контакт\n" +
                "3 Импортировать контакты\n" +
                "4 Экспортировать контакты\n" +
                "5 Удалить контакт\n" +
                "0 Выход\n");
    }

    public void run() {
        boolean isRunning = true;

        while (isRunning) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 0:
                    isRunning = false;
                    break;
                case 1:
                    List<Contact> contacts = presenter.getAllContacts();
                    displayContacts(contacts);
                    break;
                case 2:
                    System.out.print("Введите имя: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите номер телефона: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Введите адрес: ");
                    String address = scanner.nextLine();
                    Contact newContact = new Contact(name, phoneNumber, address);
                    presenter.addContact(newContact);
                    System.out.println("Контакт добавлен.");
                    break;
                case 3:
                    System.out.print("Введите путь к файлу для импорта: ");
                    String importFilePath = scanner.nextLine();
                    presenter.importContacts(importFilePath);
                    System.out.println("Контакты импортированы.");
                    break;
                case 4:
                    System.out.print("Введите путь к файлу для экспорта: ");
                    String exportFilePath = scanner.nextLine();
                    presenter.exportContacts(exportFilePath);
                    System.out.println("Контакты экспортированы.");
                    break;
                case 5:
                    System.out.println("Не успел сделать");
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте еще раз.");
                    break;
            }
        }
    }

    public void displayContacts(List<Contact> contacts) {
        System.out.println("Список контактов:");
        for (Contact contact : contacts) {
            System.out.println(contact.getName() + " | " + contact.getPhoneNumber() + " | " + contact.getAddress());
        }
        System.out.println();
    }
}