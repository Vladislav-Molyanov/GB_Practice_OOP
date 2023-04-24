package Products;
/** Дочерний класс Product
 * @class Бутылка воды 
*/
public class BottelOfWater extends Product {
    /** Объем воды */
    private int volume;

    /**Конструктор бутылки воды 3 параметра
     * @param name наименование воды
     * @param price цена воды
     * @param volume объем воды
     */
    public BottelOfWater (String name, double price, int volume){
        super(name, price);
        this.volume = volume;
    }
    /**
     * Получаем объем воды
     * @return объем воды
     */
    public int getVoluem(){
        return volume;
    }
    //** Устанавливаем объем воды */
    public void setVoluem(int volume){
        this.volume = volume;
    }
    /** Переопределяем метод toString() для
     * @class BottelOfWater
     */
    @Override
    public String toString() {
        return "Product{" +
        "name='" + super.getName() + '\'' + 
        ", cost=" + super.getPrice() + 
        ", volume=" + volume +
        '}';
    }
}
