import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.ComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ejercicio_6_JSpinner_JSlider_Font extends JFrame {

	public Ejercicio_6_JSpinner_JSlider_Font() throws HeadlessException {
		// TODO Auto-generated constructor stub
		//ventana
		//JFrame ventana=new JFrame();
		JPanel panel =new JPanel();
		setContentPane(panel);
		setSize(400,400);
		setLocationRelativeTo(null);
		setTitle("fgnjoefov5uh");
		
		//resto
		JTextArea area =new JTextArea(10,10);
		JScrollPane pane= new JScrollPane(area);
		/*pane.setLocation(EXIT_ON_CLOSE, ABORT);
		pane.add(area);*/
		
		JSpinner spinner= new JSpinner();
		spinner.setValue(25);
		Font font =area.getFont();
		
		JSlider jSlider=new JSlider();
		jSlider.setMaximum(100);
		jSlider.setMinimum(0);
		jSlider.setValue(50);
		jSlider.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				
				spinner.setValue(jSlider.getValue());
				area.setFont(new Font(font.getName(),font.getStyle(),(int) jSlider.getValue()));
				
			}
		});
		spinner.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				area.setFont(new Font(font.getName(),font.getStyle(),(int) spinner.getValue()));
				jSlider.setValue((int)spinner.getValue());
				
			}
		});
		//ComboBoxModel<String>
		
		panel.add(pane);
		panel.add(spinner);
		panel.add(jSlider);
		setVisible(true);
	}

	public Ejercicio_6_JSpinner_JSlider_Font(GraphicsConfiguration gc) {
		super(gc);
		// TODO Auto-generated constructor stub
	}

	public Ejercicio_6_JSpinner_JSlider_Font(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public Ejercicio_6_JSpinner_JSlider_Font(String title, GraphicsConfiguration gc) {
		super(title, gc);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ejercicio_6_JSpinner_JSlider_Font ej=new Ejercicio_6_JSpinner_JSlider_Font();
	}

}
