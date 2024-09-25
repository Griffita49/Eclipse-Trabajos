import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JToggleButton;

public class Ejercicio_2_BarraMenu extends JFrame {

	public Ejercicio_2_BarraMenu() throws HeadlessException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(400, 400);
		setSize(400,400);
		setTitle("ZI");
		
		JPanel contenPane=new JPanel();
		setContentPane(contenPane);
		
		JMenuBar menuBar= new JMenuBar();

		//1
		JMenu archivoJMenu= new JMenu("archivo");
		menuBar.add(archivoJMenu);
	
		JMenuItem nuevoJMenuItem = new JMenuItem("nuevo");
		JMenuItem abrirJMenuItem = new JMenuItem("abrir");
		JMenuItem salirJMenuItem = new JMenuItem("salir");
		
	/*extra*/	JCheckBoxMenuItem checkBoxMenuItem= new JCheckBoxMenuItem("Check");
		archivoJMenu.add(checkBoxMenuItem);
		
		archivoJMenu.add(nuevoJMenuItem);
		archivoJMenu.add(abrirJMenuItem);
		archivoJMenu.add(salirJMenuItem);
		
		
		//2
		JMenu editarJMenu= new JMenu("editar");
		menuBar.add(editarJMenu);
		
		JMenuItem copiarJMenuItem = new JMenuItem("copiar");
		JMenuItem pegarJMenuItem = new JMenuItem("pegar");
		
	/*extra*/	JRadioButtonMenuItem buttonMenuItem= new JRadioButtonMenuItem("Botton");
		editarJMenu.add(buttonMenuItem);
		
		editarJMenu.add(copiarJMenuItem);
		editarJMenu.add(pegarJMenuItem);
		
		//3
		JMenu formatoJMenu= new JMenu("formato");
		menuBar.add(formatoJMenu);
		
		JMenuItem negritaJMenuItem = new JMenuItem("negrita");
		JMenuItem cursivaJMenuItem = new JMenuItem("cursiva");
		
		formatoJMenu.add(negritaJMenuItem);
		formatoJMenu.add(cursivaJMenuItem);
		
		
		//agregamos el menubar como container del jframe
		setJMenuBar(menuBar);
		menuBar.setVisible(true);
	
		
	JLabel	texto=new JLabel();
	texto.setText("ETIQUETA");
		
	
	
	
	JButton button= new JButton("lol");
	JToggleButton button2= new JToggleButton();
	
	button.addActionListener(new ActionListener() {
		
		@Override
		public void  actionPerformed(ActionEvent e) {
				
			System.out.println("xddd boton presionado");
			
		}
	});
	
	
	JRadioButton radioButton=new JRadioButton();
	JCheckBox checkBox= new JCheckBox("Toyota");
	JCheckBox checkBox2= new JCheckBox("Hynday");
	JCheckBox checkBox3= new JCheckBox("Audi");
	
	checkBox.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			texto.setText("");
			
			if(checkBox.isSelected()) {
				texto.setText(texto.getText()+checkBox.getText()+ " ");
			}
			if (checkBox2.isSelected()) {
				texto.setText(texto.getText()+checkBox2.getText() + " ");
			}
			if (checkBox3.isSelected()) {
				texto.setText(texto.getText()+checkBox3.getText() + " ");
			}
			
		}
	});
	checkBox2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			texto.setText("");
			
			if(checkBox.isSelected()) {
				texto.setText(texto.getText()+checkBox.getText());
			}
			if (checkBox2.isSelected()) {
				texto.setText(texto.getText()+checkBox2.getText());
			}
			if (checkBox3.isSelected()) {
				texto.setText(texto.getText()+checkBox3.getText());
			}
			
		}
	});
	
	checkBox3.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			texto.setText("");
			
			if(checkBox.isSelected()) {
				texto.setText(texto.getText()+checkBox.getText());
			}
			if (checkBox2.isSelected()) {
				texto.setText(texto.getText()+checkBox2.getText());
			}
			if (checkBox3.isSelected()) {
				texto.setText(texto.getText()+checkBox3.getText());
			}
			
		}
	});
	
	JCheckBox checkBox4= new JCheckBox("1");
	JCheckBox checkBox5= new JCheckBox("2");
	JCheckBox checkBox6= new JCheckBox("3");
	
	
	
	button.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			texto.setText("");
			int cantidad=0;
			
			if(checkBox4.isSelected()) {
				texto.setText(texto.getText()+checkBox4.getText());
				cantidad++;
			}
			if (checkBox5.isSelected()) {
				texto.setText(texto.getText()+checkBox5.getText());
				cantidad++;

			}
			if (checkBox6.isSelected()) {
				texto.setText(texto.getText()+checkBox6.getText());
				cantidad++;

			}
			
			if(cantidad==2) {
				texto.setText("");
			if(checkBox4.isSelected() ) {
				texto.setText(texto.getText()+ " ,"+checkBox4.getText());
			}
			if(checkBox5.isSelected() ) {
				texto.setText(texto.getText()+ " ,"+checkBox5.getText());
			}
			if(checkBox6.isSelected()) {
				texto.setText(texto.getText()+ " ,"+checkBox6.getText());
			}
			}
			
		}
	});
//	contenPane.add(button2);
	
	contenPane.add(button);
	
	contenPane.add(checkBox);
	contenPane.add(checkBox2);
	contenPane.add(checkBox3);
	
	contenPane.add(checkBox4);
	contenPane.add(checkBox5);
	contenPane.add(checkBox6);
	
	contenPane.add(radioButton);
	contenPane.add(texto);
		setVisible(true);
		
	}

	public Ejercicio_2_BarraMenu(GraphicsConfiguration gc) {
		super(gc);
		// TODO Auto-generated constructor stub
	}

	public Ejercicio_2_BarraMenu(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public Ejercicio_2_BarraMenu(String title, GraphicsConfiguration gc) {
		super(title, gc);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	 Ejercicio_2_BarraMenu ventana= new Ejercicio_2_BarraMenu();

	}

}
