package InterfazGrafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class InterfazDificultad extends JFrame {

	private JPanel contentPane;
	private int dificultad = 0;
	
	public InterfazDificultad() {
			
			setTitle("Dificultad");
			
			setBounds(600, 300, 250, 300);
			
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			setVisible(true);
			
			contentPane = new JPanel();
			
			contentPane.setLayout(null);
			
			setContentPane(contentPane);
			
			JLabel titulo = new JLabel("Selecciona la dificultad: ");
			titulo.setBounds(50, 30, 150, 20);
			contentPane.add(titulo);
			
			JRadioButton facil = new JRadioButton("Facil");
		    JRadioButton inter = new JRadioButton("Intermedio");
		    JRadioButton difi = new JRadioButton("Dificil");
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
			facil.addActionListener(new ActionListener(){			
				public void actionPerformed(ActionEvent e) {
					
					dificultad = 1;
					
				}
			});
			
			inter.addActionListener(new ActionListener(){			
				public void actionPerformed(ActionEvent e) {
					
					dificultad = 2;
					
				}
			});
			
			difi.addActionListener(new ActionListener(){			
				public void actionPerformed(ActionEvent e) {
					
					dificultad = 3;
					
				}
			});
		     
		    JButton boton = new JButton("Seleccionar");
		    boton.setBounds(60, 230, 120, 20);
		    boton.setMnemonic(KeyEvent.VK_ENTER);
			contentPane.add(boton);
			boton.addActionListener(new ActionListener(){			
				public void actionPerformed(ActionEvent e) {
							
					contentPane.setVisible (false);
					dispose();
					
					MasterMind frame = new MasterMind();
					frame.setVisible(true);
					
					
				}
			});
		    
			
			
	}

	public int getDificultad() {
		return dificultad;
	}
	
}
