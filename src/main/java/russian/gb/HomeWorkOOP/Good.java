package russian.gb.HomeWorkOOP;

public class Good {
    private String name;
    private int cost;
    private double retying;
    protected int amount;
    public Good(String name, int cost, double retying, int amount) {
        this.name = name;
        this.cost = cost;
        this.retying = retying;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount() {
        amount--;
    }

    @Override
    public String toString() {
        return "Good{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", retying=" + retying +
                ", amount=" + amount +
                '}';
    }
    public void deliveryOfGoods(int item){
        amount+=item;
    }
}
