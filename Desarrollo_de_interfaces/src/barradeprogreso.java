import java.awt.BorderLayout;
import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class barradeprogreso {

	public barradeprogreso() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		JFrame frame= new JFrame();
		JPanel panel = new JPanel(new BorderLayout());
		
		JProgressBar bar= new JProgressBar();
		bar.setStringPainted(true);
		
		new Timer(100, e -> {
			int value = bar.getValue();
			if(value<100) {
				bar.setValue(value+1);
			}else {
				((Timer) e.getSource()).stop();
			}
		}).start();
		
		panel.add(bar);
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(400,400);
	}

}
