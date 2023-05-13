import Products.BottelOfWater;
import Products.HotDrink;
import Products.Product;
import VendingMachines.VendingMachine;

public class App {
    public static void main(String[] args) {


        VendingMachine itemMachine = new VendingMachine(300);

        itemMachine.addProduct(new Product("Leys", 47.0));
        itemMachine.addProduct(new Product("Snack", 80.0));
        itemMachine.addProduct(new BottelOfWater("Fanta", 69.0, 500));        
        itemMachine.addProduct(new BottelOfWater("Water", 35.0, 1500));
        itemMachine.addProduct(new HotDrink("Coffe Raf", 220, 70));
        itemMachine.addProduct(new HotDrink("Coffe Americano", 87,88));
        itemMachine.addProduct(new HotDrink("Coffe Cappuccino", 148, 80));


        for (Product prod : itemMachine.getProdAll()) {
            System.out.println(prod);
        }

        interFace inter = new interFace();
        inter.setVisible(true);
       // System.out.println(item1.getName());
       // System.out.println(item1.getPrice());
       // System.out.println(item1.toString());
        
    }
}
