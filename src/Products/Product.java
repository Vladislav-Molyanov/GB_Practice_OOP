package Products;

public class Product {
    private String name;
    private double price;
    
    public Product(String name, double price) {
        if (name == "") {
            throw new IllegalStateException(String.format("У продукта отсутсвует наименование!", name));
        }
        else {
            this.name = name;
            this.price = price;
        }
    }

    

    public String getName(){
        return name;
    }

    public Double getPrice(){
        return price;
    }

    public void setPrice (double value){
        if (value <= 0) {
            throw new IllegalStateException(String.format("Цена указана некорректно", value));
        }
        this.price = value;
    }

    @Override
    public String toString() {
        return "Product{" +
        "name='" + name + '\'' + 
        ", cost=" + price + 
        '}';
    }
}
