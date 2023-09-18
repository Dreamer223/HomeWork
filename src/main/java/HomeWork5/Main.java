package HomeWork5;
public class Main {
    public static void main(String[] args) {
        ContactRepository repository = new ContactRepository();
        ContactView view = new ContactView();
        ContactPresenter presenter = new ContactPresenter(repository);
        view.setPresenter(presenter);

        view.run();
    }
}
