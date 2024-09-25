import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Ejercicio5 extends JFrame {

	public Ejercicio5() throws HeadlessException {
		JFrame ventana=new JFrame();
		ventana.setSize(400,400);
		ventana.setLocationRelativeTo(null);
		ventana.setTitle("la appp");
		
		JPanel panel= new JPanel();
		
		
		JMenuBar menuBar=new JMenuBar();	
		
		ventana.setJMenuBar(menuBar);
		
		JMenu menu=new JMenu("Archivo");
		menuBar.add(menu);
		
		
		JMenuItem menuItem1= new JMenuItem("Nuevo");
		menu.add(menuItem1);
		
		
		JTextArea area = new JTextArea(10,10);
		
		JScrollPane pane= new JScrollPane(area);
	
		
		ventana.add(pane);
		ventana.setVisible(true);
		
	//	ScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		menuItem1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.setText("");
			}
		});
	}

	public Ejercicio5(GraphicsConfiguration gc) {
		super(gc);
		// TODO Auto-generated constructor stub
	}

	public Ejercicio5(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public Ejercicio5(String title, GraphicsConfiguration gc) {
		super(title, gc);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio5 ejercicio5 = new Ejercicio5();
	}

}
