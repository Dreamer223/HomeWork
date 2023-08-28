package russian.gb.HomeWorkOOP;

import java.util.ArrayList;
import java.util.List;

//2)Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
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
