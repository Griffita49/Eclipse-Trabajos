import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layout_borderLayout {

	public Layout_borderLayout() {
		// TODO Auto-generated constructor stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame();
		JPanel jPanel = new JPanel(new BorderLayout());
		
		jPanel.add(new Button( "NORTE"),BorderLayout.NORTH);
		jPanel.add(new Button ("Sur"), BorderLayout.SOUTH);
		jPanel.add(new Button ("este") ,BorderLayout.EAST);
		jPanel.add(new Button ("oeste"),BorderLayout.WEST);
		
		
		
		frame.add(jPanel);
		
		frame.setSize(300,400);
		frame.setVisible(true);

	}

}
