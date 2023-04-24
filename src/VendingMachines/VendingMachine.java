package VendingMachines;

import Products.Product;
import System.out.println;
import java.util.List;
import java.util.ArrayList;

import Products.Product; 

public class VendingMachine {
    private int volume;
    private List<Product> products;
    private List<String> workLog;

    public VendingMachine(int volume){
        this.volume = volume;
        workLog = new ArrayList<String>();
        products = new ArrayList<Product>();
    }

    public void addProduct (Product prod) {
        products.add(prod);
    }

    public void addSales (String line) {
        workLog.add(line);
    }

    public Product getProdByName (String name){
        for (Product prod : products) {
            if (prod.getName().contains(name)) {
                return prod;
            }
        }
        return null;
    }

    public List<Product> getProdAll(){
        return products;
    }
}
