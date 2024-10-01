import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layout_GridBagLayout {

	public Layout_GridBagLayout() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame()	;
		JPanel panel= new JPanel(new GridBagLayout()); 
		
		GridBagConstraints c= new GridBagConstraints();
		
		c.gridx=0;
		c.gridy=0;
		
		panel.add(new JButton ("Boton1"),c );
		
		c.gridx=1;
		c.gridy=0;
		
		panel.add(new JButton ("Boton2"),c );
		c.gridx=0;
		c.gridy=1;
		c.gridwidth=2; //necesitamos del fill primero  
		
		c.fill= GridBagConstraints.HORIZONTAL; //decimos que se va a expandir horrizontalmente ."se va a rellenar"
		panel.add(new JButton ("Boton3"),c );
		
		
		frame.add(panel);
		frame.setSize(400,400);
		frame.setVisible(true);

	}

}
