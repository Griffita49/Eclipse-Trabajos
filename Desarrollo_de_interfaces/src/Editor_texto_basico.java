import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;

public class Editor_texto_basico {
//opcional pa 10 solo lo selecionado en negrita
	public Editor_texto_basico() {
		JFrame frame = new JFrame();
		JPanel panel= new JPanel(new BorderLayout());
		frame.add(panel);
		
		
		JPanel panelprincipal=new JPanel(new BorderLayout());
		JPanel toolpanel=new JPanel(new GridLayout(1,3));
		
		
		JTextArea area = new JTextArea(10,10);
		JScrollPane jScrollPane= new JScrollPane(area);
		Font fuente= area.getFont();
		
		JMenuBar bar = new JMenuBar();
		
		
		//	String [] fuentess= GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		panelprincipal.add(jScrollPane, BorderLayout.CENTER);
		JSpinner spinner= new JSpinner();
		spinner.setValue(fuente.getSize());
		JCheckBox negrita=new JCheckBox("Negrita");
		JCheckBox cursiva=new JCheckBox("Cursiva");
		spinner.setSize(10,10);
		//FONT.PLAIN 		FONT.BOLD
		toolpanel.add(cursiva);
		toolpanel.add(negrita);
		toolpanel.add(spinner);
	
		
		panel.add(bar);
		panel.add(panelprincipal);
		panel.add(toolpanel, BorderLayout.NORTH);
		
		frame.setSize(400,400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Editor_texto_basico editor_texto_basico =new Editor_texto_basico();
	}

}
