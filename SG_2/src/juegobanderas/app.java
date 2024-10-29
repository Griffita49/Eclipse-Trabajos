package juegobanderas;

import java.awt.Frame;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class app {
	
	public app () {
	JFrame frame= new JFrame();
	JPanel panel= new JPanel(new GridLayout(4,8,10,10));
	
	//España
	agregarLabel(panel);
	
	
	
	frame.add(panel);
	frame.setLocationRelativeTo(null);
	frame.setSize(400,400);
	frame.setVisible(true);
	}
	
    public void agregarLabel(JPanel panel) {
        // Crear las banderas y los botones
        String[] paises = {
            "España", "Antigua Y Barbuda", "Argentina", "Bahamas",
            "Barbados", "Belice", "Bolivia", "Brasil",
            "Canadá", "Chile", "Colombia", "Costa Rica",
            "Cuba", "Ecuador"
        };
        
        String[] imagenes = {
            "img/espana.png", "img/Antigua-y-Barbuda-Bandera-America.png",
            "img/Argentina-Bandera-America.png", "img/Bahamas-Bandera-America.png",
            "img/Barbados-Bandera-America.png", "img/Belice-Bandera-America.png",
            "img/Bolivia-Bandera-America.png", "img/Brasil-Bandera-America.png",
            "img/Canadá-Bandera-America.png", "img/Chile-Bandera-America.png",
            "img/Colombia-Bandera-America.png", "img/Costa-Rica-Bandera-America.png",
            "img/Cuba-Bandera-America.png", "img/Ecuador-Bandera-America.png"
        };
        
        for (int i = 0; i < paises.length; i++) {
            JLabel bandera = new JLabel(new ImageIcon(imagenes[i]));
            panel.add(bandera);
            panel.add(new BotonBanderas(paises[i], paises)); // Pasamos la lista de países
        }
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		app app= new app();
	}

}
