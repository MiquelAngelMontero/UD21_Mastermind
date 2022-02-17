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
	protected JButton boton = new JButton("Confirmar");
	protected int fin=0;

	private JButton[] secreto = new JButton[5];
	private JButton[] secreto2 = new JButton[6];
	private JButton[] secreto3 = new JButton[7];


	public MasterMind(int dificultad) {

		this.dificultad=dificultad;
		
		pantalla = new JPanel();
		pantalla.setLayout(null);
		setContentPane(pantalla);

		setTitle("Master Mind");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(550, 300, 1000, 400);

		JLabel ColorsTxt = new JLabel("Estos son los colores disponibles:");
		ColorsTxt.setBounds(10, 50, 400, 10);
		pantalla.add(ColorsTxt);

		rojo.setBackground(Color.RED);
		rojo.setBounds(310, 32, 100, 50);

		naranja.setBackground(Color.ORANGE);
		naranja.setBounds(410, 32, 100, 50);

		verde.setBackground(new Color(0, 128, 0));
		verde.setBounds(510, 32, 100, 50);

		azul.setBackground(Color.BLUE);
		azul.setBounds(610, 32, 100, 50);

		rosa.setBackground(Color.PINK);
		rosa.setBounds(710, 32, 100, 50);

		JLabel ComSecTxt = new JLabel("Combinacion secreta:");
		ComSecTxt.setBounds(10, 175, 400, 10);
		pantalla.add(ComSecTxt);

		pantalla.add(rojo);
		pantalla.add(naranja);
		pantalla.add(verde);
		pantalla.add(azul);
		pantalla.add(rosa);

		 boton.setBounds(350, 275, 120, 40);
		 boton.setMnemonic(KeyEvent.VK_ENTER);
		 pantalla.add(boton);
		 
		 if(dificultad==1) {
			for (int i = 0; i < 5; i++) {
				secreto[i] = new JButton("");
				pantalla.add(secreto[i]);
				secreto[i].setEnabled(false);
			}
		}else if(dificultad==2) {
			for (int i = 0; i < 6; i++) {
				secreto2[i] = new JButton("");
				pantalla.add(secreto2[i]);
				secreto2[i].setEnabled(false);
			}
		}else if(dificultad==3) {
			for (int i = 0; i < 7; i++) {
				secreto3[i] = new JButton("");
				pantalla.add(secreto3[i]);
				secreto3[i].setEnabled(false);
			}
		}

		rosa.addActionListener(new Resultado());
		azul.addActionListener(new Resultado());
		verde.addActionListener(new Resultado());
		naranja.addActionListener(new Resultado());
		rojo.addActionListener(new Resultado());
	}

	public class Resultado implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(dificultad==1) {
				secreto[0].setBounds(210, 150, 100, 50);
				secreto[1].setBounds(310, 150, 100, 50);
				secreto[2].setBounds(410, 150, 100, 50);
				secreto[3].setBounds(510, 150, 100, 50);
				secreto[4].setBounds(610, 150, 100, 50);
	
					if (e.getSource().equals(rojo)) {
						secreto[i].setBackground(Color.RED);
						fin++;
	
					} else if (e.getSource().equals(naranja)) {
						secreto[i].setBackground(Color.ORANGE);
						fin++;
	
					} else if (e.getSource().equals(verde)) {
						secreto[i].setBackground(new Color(0, 128, 0));
						fin++;
	
					} else if (e.getSource().equals(azul)) {
						secreto[i].setBackground(Color.BLUE);
						fin++;
	
					} else if (e.getSource().equals(rosa)) {
						secreto[i].setBackground(Color.PINK);
						fin++;
						
					}
					i++;
					if(fin>=5) {
						boton.addActionListener(new Sel());
					}
					if(i==5) {
						i=0;
					}
			}else if(dificultad==2) {
				secreto2[0].setBounds(210, 150, 100, 50);
				secreto2[1].setBounds(310, 150, 100, 50);
				secreto2[2].setBounds(410, 150, 100, 50);
				secreto2[3].setBounds(510, 150, 100, 50);
				secreto2[4].setBounds(610, 150, 100, 50);
				secreto2[5].setBounds(710, 150, 100, 50);
	
					if (e.getSource().equals(rojo)) {
						secreto2[i].setBackground(Color.RED);
						fin++;
	
					} else if (e.getSource().equals(naranja)) {
						secreto2[i].setBackground(Color.ORANGE);
						fin++;
	
					} else if (e.getSource().equals(verde)) {
						secreto2[i].setBackground(new Color(0, 128, 0));
						fin++;
	
					} else if (e.getSource().equals(azul)) {
						secreto2[i].setBackground(Color.BLUE);
						fin++;
	
					} else if (e.getSource().equals(rosa)) {
						secreto2[i].setBackground(Color.PINK);
						fin++;
						
					}
					i++;
					if(fin>=6) {
						boton.addActionListener(new Sel());
					}
					if(i==6) {
						i=0;
					}
			}else if(dificultad==3) {
				secreto3[0].setBounds(210, 150, 100, 50);
				secreto3[1].setBounds(310, 150, 100, 50);
				secreto3[2].setBounds(410, 150, 100, 50);
				secreto3[3].setBounds(510, 150, 100, 50);
				secreto3[4].setBounds(610, 150, 100, 50);
				secreto3[5].setBounds(710, 150, 100, 50);
				secreto3[6].setBounds(810, 150, 100, 50);
	
					if (e.getSource().equals(rojo)) {
						secreto3[i].setBackground(Color.RED);
						fin++;
	
					} else if (e.getSource().equals(naranja)) {
						secreto3[i].setBackground(Color.ORANGE);
						fin++;
	
					} else if (e.getSource().equals(verde)) {
						secreto3[i].setBackground(new Color(0, 128, 0));
						fin++;
	
					} else if (e.getSource().equals(azul)) {
						secreto3[i].setBackground(Color.BLUE);
						fin++;
	
					} else if (e.getSource().equals(rosa)) {
						secreto3[i].setBackground(Color.PINK);
						fin++;
						
					}
					i++;
					if(fin>=7) {
						boton.addActionListener(new Sel());
					}
					if(i==7) {
						i=0;
					}
			}
		}
	
	}
	public class Sel implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			pantalla.setVisible (false);
			dispose();
			if(dificultad==1) {
				Juego Juego = new Juego(secreto, dificultad);
			}else if(dificultad==2) {
				Juego2 Juego2 = new Juego2(secreto2, dificultad);
			}else if(dificultad==3) {
				Juego3 Juego3 = new Juego3(secreto3, dificultad);
			}
		}
	}


	
}