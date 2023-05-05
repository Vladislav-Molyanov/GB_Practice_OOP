package Products;
/** Дочерний класс Product
 * @class Горячие напитки
 */
public class HotDrink extends Product {
    /** Температура напитка */
    private int temperature;

    /** Конструктор горячих напитков 3 параметра
     * @param name наименование напитка
     * @param price цена напитка
     * @param temperature температура продукта
     */
    public HotDrink(String name, int price,int temperature) {
        super(name, price);
        this.temperature = temperature;
    }

    /** Получаем температуру напитка */
    public int getTemperature(){
        return temperature;
    }
    /** Устанавливаем температуру напитка
     * @param temperature новая температура напитка
     */
    public void setTemperature(){
        this.temperature = temperature;
    }

    /**Переопределяем метод toString для
     * @class HotDrink
     */
    @Override
    public String toString() {
        return "Product{" +
        "name='" + super.getName() + '\'' + 
        ", cost=" + super.getPrice() + 
        ", °C=" + temperature +
        '}';
    }
}
