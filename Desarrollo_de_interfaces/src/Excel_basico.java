import java.awt.BorderLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PublicKey;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Excel_basico {

	public Excel_basico() {
		
		
	}

	public static void main(String[] args) {
		JFrame frame= new JFrame();
		JMenuBar bar= new JMenuBar();
		JMenu menu= new JMenu("Editar");
		JMenuItem arow= new JMenuItem("Agregar fila");
		JMenuItem acolum= new JMenuItem("Agregar columna");
		JMenuItem erow= new JMenuItem("Eliminar fila");
		JMenuItem ecolum= new JMenuItem("Eliminar Columna");
		bar.add(menu);
		menu.add(arow);
		menu.add(acolum);
		menu.add(erow);
		menu.add(ecolum);
		
		DefaultTableModel model= new DefaultTableModel(5,5);
		
		JTable table= new JTable(model);
		JScrollPane tablascroll= new JScrollPane(table);

		
		acolum.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {		
				
				model.addColumn((char)(65 + table.getColumnCount()) );
				
			}
		});
		arow.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				model.addRow( new Object[] {null} );				
			}
		});
		
		erow.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
			model.removeRow(table.getSelectedRow());
			}
		});
		
		ecolum.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel modelonuevo= new DefaultTableModel(model.getRowCount(),model.getColumnCount()-1);
				
				/*modelonuevo.setColumnCount(model.getColumnCount());
				modelonuevo.setRowCount(model.getColumnCount());*/
				table.setModel(modelonuevo);
		
			}
		});
	
		
		
		
		frame.add(tablascroll, BorderLayout.CENTER);
		frame.setJMenuBar(bar);
		frame.setVisible(true);
		frame.setSize(400,400);
	}
/*	public static void a(DefaultTableModel model) {
		
		DefaultTableModel modelonuevo= new DefaultTableModel(model.getRowCount(),model.getColumnCount()-1);
		model= modelonuevo;
	}*/
}
