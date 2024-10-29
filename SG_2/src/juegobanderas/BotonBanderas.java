package juegobanderas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class BotonBanderas extends JButton {
    private String nombrePais;
    private String[] opciones; // Opciones para el diálogo

    public BotonBanderas(String texto, String[] opciones) {
        super("Adivina"); // El texto del botón se establece en "Adivina"
        this.nombrePais = texto; // Almacena el nombre del país
        this.opciones = opciones; // Almacena las opciones para el diálogo

        setBackground(new Color(255, 255, 255));
        setForeground(Color.BLACK);
        
        // Agregar ActionListener para abrir el JDialog
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              //  mostrarDialogo();
            	System.out.println(this.toString());
            }
        });
    }

    // Método para mostrar el JDialog con las opciones
  /*  private void mostrarDialogo() {
        
    }*/

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (getModel().isPressed()) {
        //	g.setColor(Color.GREEN);
        } else {
            g.setColor(getBackground());
        }
        g.fillRect(100, 100, getWidth(), getHeight()); // Dibuja el fondo*/
    }
}


