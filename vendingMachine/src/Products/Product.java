package Products;

/**
 * Базовый класс продукта
 */

public class Product {

    /** Наименование продукта */
    private String name;
    /** Цена продукта */
    private double price;

    /**
     * Конструктор продукта 2 параметра
     * @param name наименование продукта
     * @param price цена продукта
     */
    
    public Product(String name, double price) {
        if (name == "") {
            throw new IllegalStateException(String.format("У продукта отсутсвует наименование!", name));
        }
        else {
            this.name = name;
            this.price = price;
        }
    }

    
    /** Получаем наименование продукта */
    public String getName(){
        return name;
    }
    /** Получаем цену продукта */
    public Double getPrice(){
        return price;
    }
    /** Устанавливаем цену продукта
     * @param value новая цена продукта
     */
    public void setPrice (double value){
        if (value <= 0) {
            throw new IllegalStateException(String.format("Цена указана некорректно", value));
        }
        this.price = value;
    }
    
    /** Переопределяем метод toString() */
    @Override
    public String toString() {
        return "Product{" +
        "name='" + name + '\'' + 
        ", cost=" + price + 
        '}';
    }
}
