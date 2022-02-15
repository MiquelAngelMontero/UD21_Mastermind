package InterfazGrafica;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class InterfazDificultad extends JFrame {

	private JPanel contentPane;
	private int dificultad = 0;
	
	public InterfazDificultad() {
			
			setTitle("Calculadora cambio de monedas");
			
			setBounds(600, 300, 450, 200);
			
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			setVisible(true);
			
			contentPane = new JPanel();
			
			contentPane.setLayout(null);
			
			setContentPane(contentPane);
			
			
			
			
			
	}
	
}
