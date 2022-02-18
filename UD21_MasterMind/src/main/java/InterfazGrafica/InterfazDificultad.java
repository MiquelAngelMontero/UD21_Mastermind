package InterfazGrafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;

//import Ej3.UD20B_Ej3.Clases.Ej3.Resultado;

public class InterfazDificultad extends JFrame {

	//Atributos de la clase
	
	private JPanel contentPane;
	private int dificultad = 0;
	protected JRadioButton facil = new JRadioButton("Facil");
	protected JRadioButton inter = new JRadioButton("Intermedio");
	protected JRadioButton difi = new JRadioButton("Dificil");
	JButton boton = new JButton("Seleccionar");
	
	public InterfazDificultad() {
			
			setTitle("Dificultad");//Titulo
			
			setBounds(870, 300, 300, 300);//Posicion
			
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			setVisible(true);
			
			contentPane = new JPanel();
			
			contentPane.setLayout(null);
			
			setContentPane(contentPane);
			
			
			//Cartel Superior
			JLabel titulo = new JLabel("Selecciona la dificultad: ");
			titulo.setBounds(50, 30, 150, 20);
			contentPane.add(titulo);
			
			//Serie de Radio buttons
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
		    
			//Boton de Condirmar
		    boton.setBounds(60, 230, 120, 20);
		    boton.setMnemonic(KeyEvent.VK_ENTER);
			contentPane.add(boton);
			
	}
	
	//Asignamos la dificultad dependiendo de la dificultad seleccionada
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
	
	//Una vez apretado el boton ejecutamos laclasse master mind i cerramos esta ventana
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