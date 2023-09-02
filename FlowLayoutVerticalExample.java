package admin_diseno;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class FlowLayoutVerticalExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo de FlowLayout Vertical");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 300);

        // Crear un JPanel con FlowLayout en fila vertical
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));

        // Crear botones
        JButton button1 = new JButton("Botón 1");
        JButton button2 = new JButton("Botón 2");
        JButton button3 = new JButton("Botón 3");

        // Agregar los botones al JPanel
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.setVisible(true);
    }
}

