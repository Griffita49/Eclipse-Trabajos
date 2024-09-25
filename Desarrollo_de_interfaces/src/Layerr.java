import java.awt.Component;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLayer;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Layerr extends JFrame {

	public Layerr() throws HeadlessException {
		// TODO Auto-generated constructor stub
		JFrame ventana=new JFrame();
		ventana.setSize(400,400);
		ventana.setLocationRelativeTo(null);
		
		
		
		
		JTabbedPane ventanasJTabbedPane = new JTabbedPane();
		
		ventana.setContentPane(ventanasJTabbedPane);
		
		

		ventana.setVisible(true);
		
	}

	public Layerr(GraphicsConfiguration gc) {
		super(gc);
		// TODO Auto-generated constructor stub
	}

	public Layerr(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public Layerr(String title, GraphicsConfiguration gc) {
		super(title, gc);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Layerr layerr=new Layerr();
	}

}
