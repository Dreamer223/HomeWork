package HomeWork5;
public class Main {
    public static void main(String[] args) {
        ContactRepository repository = new ContactRepository();
        ContactPresenter presenter = new ContactPresenter(repository);
        ContactView view = new ContactView(presenter);


        view.run();
    }
}
