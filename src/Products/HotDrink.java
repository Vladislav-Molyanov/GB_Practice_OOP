package Products;

public class HotDrink extends Product {
    private int temperature;

    public HotDrink(String name, int price,int temperature) {
        super(name, price);
        this.temperature = temperature;
    }

    public int getTemperature(){
        return temperature;
    }

    public void setTemperature(){
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Product{" +
        "name='" + super.getName() + '\'' + 
        ", cost=" + super.getPrice() + 
        ", °C=" + temperature +
        '}';
    }
}
