import java.awt.BorderLayout;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JList;

public class lista {

	public lista() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame= new JFrame();
		JPanel panel = new JPanel(new BorderLayout());
		DefaultListModel<String> a= new DefaultListModel<String>();
		JList<String> jList = new JList<>(a);
		a.addElement("a");
		a.addElement("a");
		a.addElement("a");
		a.addElement("a");
		a.addElement("a");
		
		jList.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				
				jList.getSelectedValue();
			}
		});
		
		panel.add(jList);
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(400,400);
	}

}
