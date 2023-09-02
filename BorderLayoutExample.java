package admin_diseno;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.BorderLayout;

public class BorderLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo de BorderLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Crear un JButton para cada área
        JButton buttonNorth = new JButton("Norte");
        JButton buttonSouth = new JButton("Sur");
        JButton buttonEast = new JButton("Este");
        JButton buttonWest = new JButton("Oeste");
        JPanel panel2=new JPanel();

        JButton button1 = new JButton("Botón 1");
        JButton button2 = new JButton("Botón 2");
        JButton button3 = new JButton("Botón 3");
        panel2.add(button1);
        panel2.add(button2);
        panel2.add(button3);
        
        // Establecer BorderLayout en el JFrame
        frame.setLayout(new BorderLayout());

        // Agregar los botones en diferentes áreas
        frame.add(buttonNorth, BorderLayout.NORTH);
        frame.add(buttonSouth, BorderLayout.SOUTH);
        frame.add(buttonEast, BorderLayout.EAST);
        frame.add(buttonWest, BorderLayout.WEST);
        frame.add(panel2, BorderLayout.CENTER);

        
        
        frame.setVisible(true);
    }
}