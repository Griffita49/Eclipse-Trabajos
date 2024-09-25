import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JSpinner;

public class Ejercicio_spinner extends JFrame {

	public Ejercicio_spinner() throws HeadlessException {
		// TODO Auto-generated constructor stub
		
		JFrame ventana=new JFrame();
		ventana.setSize(400,400);
		ventana.setLocationRelativeTo(null);
		ventana.setTitle("la appp");
		JPanel panel= new JPanel();
		setContentPane(panel);
		
		JSlider jSlider=new JSlider();
		panel.add(jSlider);
		jSlider.setValue(25);
		jSlider.setMaximum(100);
		jSlider.setMinimum(0);
		
		//poner el texto
		jSlider.setPaintLabels(true);
		jSlider.setMajorTickSpacing(10);
		
		//
		JSpinner jSpinner= new JSpinner();
		panel.add(jSpinner);
		jSpinner.setValue(25);
		
		
		
		setVisible(true);
	}

	public Ejercicio_spinner(GraphicsConfiguration gc) {
		super(gc);
		// TODO Auto-generated constructor stub
	}

	public Ejercicio_spinner(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public Ejercicio_spinner(String title, GraphicsConfiguration gc) {
		super(title, gc);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Ejercicio_spinner ejercicio_spinner = new Ejercicio_spinner();
	}

}
