import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.table.DefaultTableModel;

import org.w3c.dom.bootstrap.DOMImplementationRegistry;

public class JtoolbaryJTable {

	public JtoolbaryJTable() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame= new JFrame();
		JPanel panel = new JPanel(new BorderLayout());
		
		JToolBar bar= new JToolBar();
		JButton button= new JButton("a");
		JButton button1= new JButton("a");
		JButton button2= new JButton("a");
		JButton button3= new JButton("a");
		
		bar.add(button);
		bar.add(button1);
		bar.add(button2);
		bar.addSeparator();
		bar.add(button3);
		
		String[][] h={ {"1","2","3"},{"1","2","3"},{"1","2","3"} };
		String[] c= {"1","2","3"};
		
		JTable table= new JTable(h,c);
	//	DefaultTableModel model= new DefaultTableModel();
	//	table.setModel(model);
		
	//model.addRow(h);
		
		panel.add(table,BorderLayout.CENTER);
		frame.add(panel);
		frame.add(bar,BorderLayout.SOUTH);
		frame.setVisible(true);
		frame.setSize(400,400);
	}

}
