import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layout_GridBagLayout_2 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo avanzado de GridBagLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Establecer el layout
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Botón 1: Posición (0,0), tamaño fijo
        JButton button1 = new JButton("Botón 1");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.NONE;  // Tamaño fijo
        gbc.weightx = 0;  // No Crece horizontalmente
        gbc.weighty = 0;  // No Crece verticalmente
        frame.add(button1, gbc);

        // Botón 2: Posición (1,0), ocupa dos celdas verticales
        JButton button2 = new JButton("Botón 2");
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 2;  // Ocupa dos filas
        gbc.fill = GridBagConstraints.BOTH;  // Ocupa todo el espacio disponible
        gbc.weightx = 1;  // Crece horizontalmente
        gbc.weighty = 1;  // Crece verticalmente
        frame.add(button2, gbc);

        // Botón 3: Posición (0,1), tamaño horizontal fijo
        JButton button3 = new JButton("Botón 3");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;  // Solo se expande horizontalmente
        gbc.weightx = 1;  // Crece horizontalmente
        gbc.weighty = 0;  // No Crece verticalmente
        frame.add(button3, gbc);

        // Botón 4: Posición (0,2), tamaño horizontal y vertical fijo
        JButton button4 = new JButton("Botón 4");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.VERTICAL;  // Tamaño fijo
        gbc.weightx = 0;  // No Crece horizontalmente
        gbc.weighty = 0;  // No Crece verticalmente
        frame.add(button4, gbc);

        frame.setVisible(true);
    }
}
