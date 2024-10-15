package eventos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class eventoss implements FocusListener, MouseListener {
	JPanel panel;
	JTextField arriba;
	public eventoss() {
		JFrame frame=new JFrame();
		frame.setSize(400,200);
		
		frame.setLayout( new BorderLayout() );
		
		arriba= new JTextField();
		arriba.addFocusListener(this);
		frame.add(arriba,BorderLayout.NORTH);
		
		 panel= new JPanel();
		panel.addMouseListener(this);
		frame.add(panel,BorderLayout.CENTER);
		
		JTextField abajo= new JTextField();
		abajo.addFocusListener(this);
		frame.add(abajo,BorderLayout.SOUTH);
		
		frame.setVisible(true);
	}

	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("mouseClicked");
		panel.setBackground(Color.white);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mousePressed");
		panel.setBackground(Color.red);
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouseReleased");
		panel.setBackground(Color.black);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouseEntered");
		panel.setBackground(Color.blue);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouseExited");
		panel.setBackground(Color.yellow);
	}

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		System.out.println("focusGained");
		arriba.setBackground(Color.orange);
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		System.out.println("focusLost");
		arriba.setBackground(Color.green);
	}

	public static void main(String[] args) {
		eventoss a= new eventoss();
	
	}
	

}


