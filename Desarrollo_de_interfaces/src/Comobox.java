import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Comobox extends JFrame {

	public Comobox() throws HeadlessException {
		// TODO Auto-generated constructor stub
		JPanel jPanel = new JPanel();
		setSize(400,400);
		setLocationRelativeTo(null);
		setContentPane(jPanel);
		
		String[] modelobox= {"honda", "xd"};
		JComboBox <String> combo= new JComboBox <>(modelobox);
		
		jPanel.add(combo);
		
		setVisible(true);
		
	}

	public Comobox(GraphicsConfiguration gc) {
		super(gc);
		// TODO Auto-generated constructor stub
	}

	public Comobox(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public Comobox(String title, GraphicsConfiguration gc) {
		super(title, gc);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Comobox comobox = new Comobox();
	}

}
