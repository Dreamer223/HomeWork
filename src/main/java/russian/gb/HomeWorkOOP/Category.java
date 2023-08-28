package russian.gb.HomeWorkOOP;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;
    private String zone;
    private List<String> goods = new ArrayList<>();

    public Category(String name, String zone) {
        this.name = name;
        this.zone = zone;
    }
    public void addGoods(Good good){
        goods.add(good.getName());
    }
    public void viewCategory(){
        System.out.println("Товары категории "+name+"\n"+goods+" Зона "+zone);
    }
}
