package russian.gb.HomeWorkOOP;
//Домашнее задание на закрепление:
//
//        1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
//        2)Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
//        3)Создать класс Basket, содержащий массив купленных товаров.
//        4)Создать класс User, содержащий логин, пароль и объект класса Basket. Создать несколько объектов класса User.
//        5)Вывести на консоль каталог продуктов. (все продукты магазина)
//        6)Вывести на консоль покупки посетителей магазина. (После покупки у пользователя добавляется товар, а из магазина - удаляется)
//
//        Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре
//
//        Формат сдачи:
//        Ссылка на гитхаб проект
//        Подписать фамилию и номер группы
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Good Apple = new Good("apple", 25, 4.8, 115);
        Good Banana = new Good("banana", 24, 4.8, 38);
        Good Cucumber = new Good("cucumber", 12, 5, 41);
        Good Tomato = new Good("tomato", 18, 4.2, 125);
        Category Fruits = new Category("fruit", "A1");
        Fruits.addGoods(Apple);
        Fruits.addGoods(Banana);
        Category Vegetables = new Category("vegetable", "A2");
        Vegetables.addGoods(Cucumber);
        Vegetables.addGoods(Tomato);
        Basket basket = new Basket(new HashMap());
        User user1 = new User("Anton","adsx");
        User user2 = new User("Alex","12as");
        User user3 = new User("Claudia","4823fd");
        User user4 = new User("Felix","felix114");

        user1.basket.GetGood(Apple);
        user1.basket.GetGood(Cucumber);
//        user1.basket.putGood(Apple);
        user1.basket.ViewBasket();
        Vegetables.viewCategory();
        user1.viewMyGoods();
        System.out.println(Apple.getAmount());

    }
}