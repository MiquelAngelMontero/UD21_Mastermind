package InterfazGrafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;


public class InterfazDificultad extends JFrame {

	private JPanel contentPane;
	private int dificultad = 0;
	protected JRadioButton facil = new JRadioButton("Facil");
	protected JRadioButton inter = new JRadioButton("Intermedio");
	protected JRadioButton difi = new JRadioButton("Dificil");
	JButton boton = new JButton("Seleccionar");
	
	public InterfazDificultad() {
			
			setTitle("Dificultad");
			
			setBounds(870, 300, 300, 300);
			
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			setVisible(true);
			
			contentPane = new JPanel();
			
			contentPane.setLayout(null);
			
			setContentPane(contentPane);
			
			JLabel titulo = new JLabel("Selecciona la dificultad: ");
			titulo.setBounds(50, 30, 150, 20);
			contentPane.add(titulo);
			
		    facil.setBounds(60, 70, 100, 30);
	     	inter.setBounds(60, 120, 100, 30);
		    difi.setBounds(60, 170, 100, 30);
		    ButtonGroup btn_grp = new ButtonGroup();
		    btn_grp.add(facil);
		    btn_grp.add(inter);
		    btn_grp.add(difi);
		    contentPane.add(facil);
		    contentPane.add(inter);
		    contentPane.add(difi);
		    facil.addActionListener(new Resultado());
			inter.addActionListener(new Resultado());
			difi.addActionListener(new Resultado());
		    
		    boton.setBounds(60, 230, 120, 20);
		    boton.setMnemonic(KeyEvent.VK_ENTER);
			contentPane.add(boton);
			
	}
	
	public class Resultado implements ActionListener {
		public void actionPerformed(ActionEvent e) {
				if(e.getSource()==facil) {
					dificultad=1;
					boton.addActionListener(new Sel());
				}else if(e.getSource()==inter) {
					dificultad=2;
					boton.addActionListener(new Sel());
				}else if(e.getSource()==difi) {
					dificultad=3;
					boton.addActionListener(new Sel());
					
				}
		}
	}
	
	public class Sel implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			contentPane.setVisible (false);
			dispose();
			
			MasterMind frame = new MasterMind(dificultad);
			frame.setVisible(true);
		}
	}

	public int getDificultad() {
		return dificultad;
	}
	
}