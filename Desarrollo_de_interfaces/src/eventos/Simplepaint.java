package Interfaces;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.List;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EjercicioPaintArreglar extends JPanel {

	//private List<Linea> lineas = new ArrayList<>(); // Lista para almacenar los puntos dibujados
	private Linea linea = new Linea();
	
	public EjercicioPaintArreglar() throws HeadlessException {
		
		// Manejador del evento cuando el mouse es presionado
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				linea.points.add(e.getPoint()); // Agrega el punto donde se presionó el mouse
				repaint(); // Redibuja el panel
			}
		});
		
		// Manejador del evento cuando el mouse se mueve con el botón presionado
		addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				linea.points.add(e.getPoint()); // Agrega los puntos donde el mouse se arrastra
				repaint(); // Redibuja el panel
			}
		});
		
		addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
		//		lineas.add(linea);
				linea.points.clear();
			}
		});
	}
	
	// Metodo para dibujar los puntos
	protected void paintComponent(Graphics g) {
		super.paintComponents(g); // Llama al metodo paintComponent de la clase padre
		
		// Establecer el color y dibujar todas las lineas entre puntos
		g.setColor(Color.BLACK);
		for (int i = 1; i < linea.points.size(); i++) {
			Point p1 = linea.points.get (i - 1);
			Point p2 = linea.points.get(i);
			g.drawLine(p1.x, p1.y, p2.x, p2.y); // Dibuja líneas entre los puntos consecutivos
		}
	}
	
	// Crear el JFrame con el lienzo de dibujo
	public static void main(String[] args) {
		JFrame frame = new JFrame("Paint Basico en Java");
		EjercicioPaintArreglar paintPannel = new EjercicioPaintArreglar();
		frame.add(paintPannel);
		frame.setSize(800, 600); // Tamaño del lienzo
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true); // Mostrar la ventana
	}

}
