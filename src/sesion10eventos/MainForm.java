package sesion10eventos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainForm {
    private JTextPane pricePane;
    private JTextPane ivaPane;
    private JTextPane totalPane;
    private JButton btnCalculate;
    private JPanel taxPanel;

    // Constructor
    public MainForm(){
       btnCalculate.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               int precio = Integer.parseInt(pricePane.getText());
               int iva = Integer.parseInt(ivaPane.getText());

               int result = precio + (precio / 100 * iva);
               totalPane.setText(Integer.toString(result));
           }
        });
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("SwingTax");
        frame.setContentPane(new MainForm().taxPanel);
        frame.setVisible(true);
    }
}
