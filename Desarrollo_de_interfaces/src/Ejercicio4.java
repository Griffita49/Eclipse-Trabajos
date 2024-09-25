import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ejercicio4 extends JFrame {

	public Ejercicio4() throws HeadlessException {
		// TODO Auto-generated constructor stub
		JFrame ventana=new JFrame();
		JPanel panel= new JPanel();
		ventana.setContentPane(panel);
		ventana.setSize(400,400);
		ventana.setLocationRelativeTo(null);
		ventana.setTitle("la appp");
		
		JTextField usuario= new JTextField(20);
		panel.add(usuario);

		JPasswordField contraseña= new JPasswordField(20);
		panel.add(contraseña);
		
		JButton botonButton= new JButton();
		panel.add(botonButton);
		
		JTextField resultado=new JTextField(20);
		panel.add(resultado);
		
		botonButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if ( !String.valueOf(contraseña.getPassword()).equals("1234") && !usuario.getText().equals("alvaro")) {
					resultado.setText("usuario y contraseña incorrecto");
				}
				else if(!String.valueOf(contraseña.getPassword()).equals("1234")) {
					resultado.setText("contraseña icnorrecta");
				}
				else if (!usuario.getText().equals("alvaro")){
					resultado.setText("usuario icnorrecta");
				}
				else {
					resultado.setText("to correcto");
				}
				
			}
		});
		
		
		ventana.setVisible(true);
	}

	public Ejercicio4(GraphicsConfiguration gc) {
		super(gc);
		// TODO Auto-generated constructor stub
	}

	public Ejercicio4(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public Ejercicio4(String title, GraphicsConfiguration gc) {
		super(title, gc);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Ejercicio4 xdEjercicio3=new Ejercicio4();

	}

}
