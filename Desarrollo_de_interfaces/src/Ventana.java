/**
 * 
 */

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.MenuItem;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 * 
 */
public class Ventana extends JFrame {

	/**
	 * @throws HeadlessException
	 */
	

	
	
	public Ventana() throws HeadlessException {
		// TODO Auto-generated constructor stub
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Mi ventana");
		
		setSize(400,400);
		setLocation(100,200);
		
		JPanel contenPane=new JPanel();
		setContentPane(contenPane);
		
		
		JMenuBar menuBar=new JMenuBar(); //la barra del menu
		JMenu menu= new JMenu("FILE");  //creamos el menu
		
	
		JMenuItem menuItem= new JMenuItem("New"); //creamos un elemento al menu
		
		menuBar.add(menu); // EL MENU SE AGREGAN A LA BARRA
		menu.add(menuItem); //Y EL ITEM SE AGREGA A EL MENU 

		setJMenuBar(menuBar);
		menuBar.setVisible(true);
		
		
		this.setVisible(true); //lo ponemos al final para q se muestre todo si no, no lo hace
	}

	/**
	 * @param gc
	 */
	public Ventana(GraphicsConfiguration gc) {
		super(gc);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param title
	 * @throws HeadlessException
	 */
	public Ventana(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param title
	 * @param gc
	 */
	public Ventana(String title, GraphicsConfiguration gc) {
		super(title, gc);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 
		Ventana window= new Ventana();
		
		
		}

}
