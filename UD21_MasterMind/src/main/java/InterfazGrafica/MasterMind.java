package InterfazGrafica;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MasterMind extends JFrame {
	private JPanel pantalla;
	private int i;

	private JButton rojo = new JButton("");
	private JButton naranja = new JButton("");
	private JButton verde = new JButton("");
	private JButton azul = new JButton("");
	private JButton rosa = new JButton("");
	private int dificultad;

	private JButton[] secreto = new JButton[5];


	public MasterMind(int dificultad) {

		this.dificultad=dificultad;
		
		pantalla = new JPanel();
		pantalla.setLayout(null);
		setContentPane(pantalla);

		setTitle("Master Mind");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(30, 30, 800, 400);

		JLabel ColorsTxt = new JLabel("Estos son los colores disponibles:");
		ColorsTxt.setBounds(10, 50, 400, 10);
		pantalla.add(ColorsTxt);

		rojo.setBackground(Color.RED);
		rojo.setBounds(210, 32, 100, 50);

		naranja.setBackground(Color.ORANGE);
		naranja.setBounds(310, 32, 100, 50);

		verde.setBackground(new Color(0, 128, 0));
		verde.setBounds(410, 32, 100, 50);

		azul.setBackground(Color.BLUE);
		azul.setBounds(510, 32, 100, 50);

		rosa.setBackground(Color.PINK);
		rosa.setBounds(610, 32, 100, 50);

		JLabel ComSecTxt = new JLabel("Combinacion secreta:");
		ComSecTxt.setBounds(10, 175, 400, 10);
		pantalla.add(ComSecTxt);

		pantalla.add(rojo);
		pantalla.add(naranja);
		pantalla.add(verde);
		pantalla.add(azul);
		pantalla.add(rosa);

		 JButton boton = new JButton("Confirmar");
		 boton.setBounds(350, 275, 120, 40);
		 boton.setMnemonic(KeyEvent.VK_ENTER);
		 pantalla.add(boton);
		 boton.addActionListener(new ActionListener(){			
			public void actionPerformed(ActionEvent e) {
							
				pantalla.setVisible (false);
				dispose();
				
				Juego Juego = new Juego(secreto, dificultad);
					
			}
		});
		
		for (int i = 0; i < 5; i++) {
			secreto[i] = new JButton("");
			pantalla.add(secreto[i]);
		}

		rosa.addMouseListener(new Resultado());
		azul.addMouseListener(new Resultado());
		verde.addMouseListener(new Resultado());
		naranja.addMouseListener(new Resultado());
		rojo.addMouseListener(new Resultado());
	}

	public class Resultado implements MouseListener {
		@Override
		public void mouseClicked(MouseEvent e) {

			secreto[0].setBounds(210, 150, 100, 50);
			secreto[1].setBounds(310, 150, 100, 50);
			secreto[2].setBounds(410, 150, 100, 50);
			secreto[3].setBounds(510, 150, 100, 50);
			secreto[4].setBounds(610, 150, 100, 50);

				if (e.getSource().equals(rojo)) {
					secreto[i].setBackground(Color.RED);

				} else if (e.getSource().equals(naranja)) {
					secreto[i].setBackground(Color.ORANGE);

				} else if (e.getSource().equals(verde)) {
					secreto[i].setBackground(new Color(0, 128, 0));

				} else if (e.getSource().equals(azul)) {
					secreto[i].setBackground(Color.BLUE);

				} else if (e.getSource().equals(rosa)) {
					secreto[i].setBackground(Color.PINK);
					
				}
				i++;
				
				if(i==5) {
					i=0;
				}
		}

		@Override
		public void mousePressed(MouseEvent e) {

		}

		@Override
		public void mouseReleased(MouseEvent e) {

		}

		@Override
		public void mouseEntered(MouseEvent e) {

		}

		@Override
		public void mouseExited(MouseEvent e) {

		}		
	}


	
}
