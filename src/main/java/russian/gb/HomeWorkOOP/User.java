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


    public void viewMyGoods(){
        List<String> myGoods = new ArrayList<>(basket.basket.keySet());
        System.out.println(myGoods);
    }
}
