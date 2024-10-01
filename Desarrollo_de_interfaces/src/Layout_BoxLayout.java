import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layout_BoxLayout {

	public Layout_BoxLayout() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame()	;
		JPanel panel= new JPanel(); 
		panel.setLayout(new BoxLayout( panel,BoxLayout.Y_AXIS));
	
		panel.add(new Button("Boton 1"));
		panel.add(new Button("Boton 3"));
		panel.add(new Button("Boton 4"));
		
		frame.add(panel);
		frame.setSize(400,400);
		frame.setVisible(true);

	}

}
