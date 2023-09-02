package admin_diseno;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class GridLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo de GridLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);

        // Crear un JPanel con GridLayout (2 filas, 3 columnas)
        JPanel panel = new JPanel(new GridLayout(2, 3));
        JPanel panel2 = new JPanel();
        FlowLayout flowLayout=new FlowLayout();
        
        
        panel2.setBackground(Color.ORANGE);
        panel2.setLayout(flowLayout);
        // Crear botones y agregarlos al JPanel los cuales se van ordenando de acuerdo al listado 
        panel.add(new JButton("Botón 1"));
        panel.add(new JButton("Botón 2"));
        panel.add(new JButton("Botón 3"));
        panel.add(new JButton("Botón 4"));
        panel.add(panel2);
        panel2.add(new JButton("BotónE 1")); 
        panel2.add(new JButton("BotónE 2"));
        panel2.add(new JButton("BotónE 3"));
        panel.add(new JButton("Botón 6"));

        // Agregar el JPanel al JFrame
        frame.add(panel);

        frame.setVisible(true);
    }
}
