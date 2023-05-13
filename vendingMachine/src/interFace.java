import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.*;
public class interFace extends JFrame {
    
    public interFace(){
        super("Торговый аппарат");
        super.setBounds(300,100,250,100);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(3,2,5,5));

        JLabel nameProduct = new JLabel("Введите продукт");
        JTextField name_Field = new JTextField("",2);

        JLabel priceProduct = new JLabel("Введите цену продукт");
        JTextField price_Field = new JTextField("@",2);
        container.add(nameProduct);
        container.add(price_Field);
        

    }
}
