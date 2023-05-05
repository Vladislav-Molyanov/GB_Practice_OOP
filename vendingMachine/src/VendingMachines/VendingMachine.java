package VendingMachines;

import Products.Product;
import System.out.println;
import java.util.List;
import java.util.ArrayList;
import Products.Product; 

/** Базовый класс Торгового аппарата */
public class VendingMachine {
    /** Объем аппарата */
    private int volume;

    /** Список продуктов */
    private List<Product> products;
    
    /**Список логов */
    private List<String> workLog;

    /**
     * Конструктор торгового аппарата 1 параметр
     * @param volume
     * @init List<String> workLog
     * @init List<Product>products
     */
    public VendingMachine(int volume){
        this.volume = volume;
        workLog = new ArrayList<String>();
        products = new ArrayList<Product>();
    }
    /** Метод добавление продукта */
    public void addProduct (Product prod) {
        products.add(prod);
    }
    /**Метод добавления логов, после продажи продукта */
    public void addSales (String line) {
        workLog.add(line);
    }
    /**Метод выводит товар по наименованию
     * @param name наименование товара
     * @return prod
     */
    public Product getProdByName (String name){
        for (Product prod : products) {
            if (prod.getName().contains(name)) {
                return prod;
            }
        }
        return null;
    }
    /** Метод возвращающий список всех продуктов */
    public List<Product> getProdAll(){
        return products;
    }
}
