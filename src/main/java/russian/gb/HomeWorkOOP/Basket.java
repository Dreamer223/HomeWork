package russian.gb.HomeWorkOOP;
import java.util.HashMap;
import java.util.Map;

public class Basket {
    Map<String,Integer> basket = new HashMap<>();

    public Basket(HashMap basket) {
        this.basket = basket;
    }

    public void GetGood(Good name) {
        basket.put(name.getName(),name.getCost());
        name.setAmount();
    }

    public void putGood(Good getName) {
        basket.remove(getName.getName(),getName.getCost());
    }

    public char ViewBasket() {
        System.out.println(basket);
        return 0;
    }

    public void clearBasket() {
        basket.clear();
    }

    public void buy() {

    }
}

