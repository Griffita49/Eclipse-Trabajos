package Interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.List;
import java.util.ArrayList;
import java.awt.*;

import javax.naming.InitialContext;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

public class Paintt extends JPanel {

	// Lista que almacena todas las figuras dibujadas (líneas o círculos)
	private List<Figura> figuras = new ArrayList<>();

	// Tipo de la figura a dibujar ("Normal" o "Circulo"), comienza en "Normal"
	String tipoActual = "Libre";

	// Figura actual que se está dibujando
	private Figura figuraActual;
	
	 static Color currentColor =  Color.BLACK;
	public Paintt() throws HeadlessException {

		// Manejador cuando el ratón es presionado
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				// Se crea una nueva figura de acuerdo al tipo actual
				figuraActual = new Figura(tipoActual);
				figuraActual.points.add(e.getPoint()); // Agrega el punto inicial
				repaint(); // Redibuja el panel
			}
		});

		// Manejador cuando el ratón se arrastra con el botón presionado
		addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				figuraActual.points.add(e.getPoint()); // Agrega los puntos al arrastrar el ratón
				repaint(); // Redibuja el panel
			}
		});

		// Manejador cuando se suelta el ratón
		addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				figuraActual.setColor(currentColor);
				figuras.add(figuraActual); // Añade la figura actual a la lista de figuras
				// figuraActual = null; // Limpia la figura actual
				repaint(); // Redibuja el panel
			}
		});
	}
	

	// Método para dibujar las figuras
	protected void paintComponent(Graphics g) {	
			
		super.paintComponent(g); // Llama a la superclase para limpiar
		
		// Dibuja todas las figuras que ya están almacenadas
		for (Figura figura : figuras) {
			drawShape(g, figura);
		}

		// Dibuja la figura que se está creando en este momento, si hay alguna
		if (figuraActual != null) { // si existe algo nuevo
			drawShape(g, figuraActual);
		}
	}

	// Método para dibujar diferentes figuras según el tipo almacenado en la Figura
	public void drawShape(Graphics g, Figura figura) {
		
		g.setColor(figura.getColor());
		
		Point starPoint = figura.points.get(0);
		Point lastPoint = figura.points.get(figura.points.size() - 1);

		switch (figura.getTipo()) {
		case "Libre":
			// Dibujar línea
			DibujoLibre free = new DibujoLibre();
			free.drawFree(g,figura);
			break;

		case "Circulo":
			Circulo circulo = new Circulo();
			circulo.setRadio((int) starPoint.distance(lastPoint));
			circulo.setInitialCoordenades(starPoint.x, starPoint.y);

			circulo.drawCircle(g);
			break;

		case "Linea":
			Linea linea = new Linea();
			linea.setInitialCoordenades(starPoint.x, starPoint.y);
			linea.setFinalCoordenades(lastPoint.x, lastPoint.y);

			linea.drawRectLine(g);
			break;

		case "Cuadrado":
			Cuadrado cuadrado = new Cuadrado();

			cuadrado.setRadio((int) starPoint.distance(lastPoint));
			cuadrado.setInitialCoordenades(starPoint.x, starPoint.y);

			cuadrado.drawSquare(g);
			break;
		default:
			break;
		}
	}

	// Crear el JFrame con el lienzo de dibujo
	public static void main(String[] args) {
		JFrame frame = new JFrame("Paint Básico en Java");
		Paintt paintPanel = new Paintt();

		JToolBar toolBar = new JToolBar();

		JButton libreButton = new JButton("Libre");
		JButton lineaButton = new JButton("Linea");
		JButton circuloButton = new JButton("Círculo");
		JButton cuadradoButton = new JButton("Cuadrado");

		toolBar.add(libreButton);
		toolBar.add(lineaButton);
		toolBar.add(circuloButton);
		toolBar.add(cuadradoButton);

		// Eventos del toolbar
		circuloButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				paintPanel.tipoActual = "Circulo"; // Cambia el tipo actual a "Circulo"
			}
		});
		libreButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				paintPanel.tipoActual = "Libre";
			}
		});
		lineaButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				paintPanel.tipoActual = "Linea";
			}
		});
		cuadradoButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				paintPanel.tipoActual = "Cuadrado";
			}
		});

		//MENU
		JMenuBar bar= new JMenuBar();
		JMenu menuarchivo= new JMenu("Archivo");
		JMenuItem nuevoPaint= new JMenuItem("Nuevo");
		JMenuItem exitPaint= new JMenuItem("Exit");
		
		menuarchivo.add(nuevoPaint);
		menuarchivo.add(exitPaint);
		
		JMenu menuEstilo= new JMenu("Estilo");
		JMenuItem colorPaint= new JMenuItem("Color");
		JMenuItem grosorPaint= new JMenuItem("Grosor");
		menuEstilo.add(colorPaint);
		menuEstilo.add(grosorPaint);
		
		bar.add(menuarchivo);
		bar.add(menuEstilo);
		
		//eventos del menu
		exitPaint.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		nuevoPaint.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        // Limpiar el lienzo (vaciar la lista de figuras y redibujar)
		    	paintPanel.figuraActual=null;
		        paintPanel.figuras.clear();  // Borra todas las figuras
		        paintPanel.repaint();  // Redibuja el panel
		    }
		});

		
		colorPaint.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        // Abrir un diálogo de selección de color
		        Color selectedColor = JColorChooser.showDialog(null, "Elige un color", currentColor);
		        if (selectedColor != null) {
		            currentColor = selectedColor;  // Cambiar el color actual si el usuario selecciona uno
		        }
		    }
		});
		


		
		// Añadimos todo al Jframe
		
		frame.setJMenuBar(bar);
		frame.add(toolBar, BorderLayout.NORTH);
		frame.add(paintPanel); // Añade el panel de dibujo

		frame.setSize(800, 600); // Tamaño del lienzo
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar la aplicación al salir
		frame.setVisible(true); // Hace visible la ventana
	}
}
