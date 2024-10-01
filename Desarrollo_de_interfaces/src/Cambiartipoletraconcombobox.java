import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.HeadlessException;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Cambiartipoletraconcombobox extends JFrame {

	public Cambiartipoletraconcombobox() throws HeadlessException {
		// TODO Auto-generated constructor stub
		JPanel jPanel = new JPanel();
		setContentPane(jPanel);
		setSize(400,400);
		JTextArea area =new JTextArea(20,20);
		String [] fuentess= GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		JComboBox<String> box= new JComboBox<>(fuentess);
		
		
		jPanel.add(area);
		jPanel.add(box);
		
		setVisible(true);
		
		
		box.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.setFont(new Font(box.getSelectedItem().toString() , Font.PLAIN,12)); //objeto font -> tipo de letra (string), negrita o cursiva  ,tamaño(int)
				
			}
		});
	}

	public Cambiartipoletraconcombobox(GraphicsConfiguration gc) {
		super(gc);
		// TODO Auto-generated constructor stub
	}

	public Cambiartipoletraconcombobox(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public Cambiartipoletraconcombobox(String title, GraphicsConfiguration gc) {
		super(title, gc);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cambiartipoletraconcombobox cambiartipoletraconcombobox =new  Cambiartipoletraconcombobox();
	}

}
