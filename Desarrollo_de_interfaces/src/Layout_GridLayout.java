import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layout_GridLayout {

	public Layout_GridLayout() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame()	;
		JPanel panel= new JPanel(new GridLayout(2,3)); //dos filas //3 columnas
		
		for(int i=0; i<=6 ;i++) {
			panel.add(new JButton("Boton"+i));
		}
		
		frame.add(panel);
		frame.setSize(400,400);
		frame.setVisible(true);

	}

}
