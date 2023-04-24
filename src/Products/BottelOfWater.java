package Products;

public class BottelOfWater extends Product {
    private int volume;

    public BottelOfWater (String name, double price, int volume){
        super(name, price);
        this.volume = volume;
    }

    public int getVoluem(){
        return volume;
    }

    public void setVoluem(int volume){
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Product{" +
        "name='" + super.getName() + '\'' + 
        ", cost=" + super.getPrice() + 
        ", volume=" + volume +
        '}';
    }
}
