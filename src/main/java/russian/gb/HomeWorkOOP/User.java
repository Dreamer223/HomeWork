package russian.gb.HomeWorkOOP;
import java.util.*;
public class User<basket> {
    private String name;
    private String password;
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    Basket basket = new Basket(new HashMap());
    List<String> myGoods;
    public void buyBusket(){
        myGoods = new ArrayList<>(basket.basket.keySet());
        basket.basket.clear();
    }
    public void viewMyGoods(){
        System.out.println(myGoods);
    }
}
