package russian.gb.HomeWorkOOP;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

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
        user2.basket.GetGood(Tomato);
        System.out.println(Apple.getAmount());
        user1.buyBusket();
        user1.viewMyGoods();


    }
}