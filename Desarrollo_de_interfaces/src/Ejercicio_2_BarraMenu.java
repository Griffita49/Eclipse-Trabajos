import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;

public class Ejercicio_2_BarraMenu extends JFrame {

	public Ejercicio_2_BarraMenu() throws HeadlessException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(400, 400);
		setSize(400,400);
		setTitle("ZI");
		
		JPanel contenPane=new JPanel();
		setContentPane(contenPane);
		
		JMenuBar menuBar= new JMenuBar();

		//1
		JMenu archivoJMenu= new JMenu("archivo");
		menuBar.add(archivoJMenu);
	
		JMenuItem nuevoJMenuItem = new JMenuItem("nuevo");
		JMenuItem abrirJMenuItem = new JMenuItem("abrir");
		JMenuItem salirJMenuItem = new JMenuItem("salir");
		
	/*extra*/	JCheckBoxMenuItem checkBoxMenuItem= new JCheckBoxMenuItem("Check");
		archivoJMenu.add(checkBoxMenuItem);
		
		archivoJMenu.add(nuevoJMenuItem);
		archivoJMenu.add(abrirJMenuItem);
		archivoJMenu.add(salirJMenuItem);
		
		
		//2
		JMenu editarJMenu= new JMenu("editar");
		menuBar.add(editarJMenu);
		
		JMenuItem copiarJMenuItem = new JMenuItem("copiar");
		JMenuItem pegarJMenuItem = new JMenuItem("pegar");
		
	/*extra*/	JRadioButtonMenuItem buttonMenuItem= new JRadioButtonMenuItem("Botton");
		editarJMenu.add(buttonMenuItem);
		
		editarJMenu.add(copiarJMenuItem);
		editarJMenu.add(pegarJMenuItem);
		
		//3
		JMenu formatoJMenu= new JMenu("formato");
		menuBar.add(formatoJMenu);
		
		JMenuItem negritaJMenuItem = new JMenuItem("negrita");
		JMenuItem cursivaJMenuItem = new JMenuItem("cursiva");
		
		formatoJMenu.add(negritaJMenuItem);
		formatoJMenu.add(cursivaJMenuItem);
		
		
		//agregamos el menubar como container del jframe
		setJMenuBar(menuBar);
		menuBar.setVisible(true);
	
		setVisible(true);
		
	}

	public Ejercicio_2_BarraMenu(GraphicsConfiguration gc) {
		super(gc);
		// TODO Auto-generated constructor stub
	}

	public Ejercicio_2_BarraMenu(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public Ejercicio_2_BarraMenu(String title, GraphicsConfiguration gc) {
		super(title, gc);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	 Ejercicio_2_BarraMenu ventana= new Ejercicio_2_BarraMenu();

	}

}
