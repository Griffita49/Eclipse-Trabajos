import java.awt.BorderLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class tabbedpane {

	public tabbedpane() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		JFrame frame= new JFrame();
		JTabbedPane panel= new JTabbedPane();
		
		JMenuBar bar= new JMenuBar();
		JMenu menu= new JMenu("Archivo");
		JMenuItem nuevo= new JMenuItem("Nuevo");
		JMenuItem eliminar= new JMenuItem("Eliminar");
		
		bar.add(menu);
		
		menu.add(nuevo);
		menu.add(eliminar);
	

		nuevo.addActionListener(new ActionListener() {
			int i=0;
			@Override
			public void actionPerformed(ActionEvent e) {
				JPanel jPanel= new JPanel();
				TextArea area= new TextArea();
				jPanel.add(area);	
			
				panel.add("Panel"+ (panel.getTabCount()+1) ,jPanel);
				panel.setSelectedIndex(i);
				i++;
			}
		});
		
		eliminar.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
			panel.remove(panel.getSelectedIndex());
				
			}
		});
		
		frame.setJMenuBar(bar);
		frame.add(panel);
		
		frame.setLocationRelativeTo(null);
		frame.setSize(400,400);
		frame.setVisible(true);
	
	}

}
