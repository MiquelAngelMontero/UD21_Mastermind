package InterfazGrafica;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.*;

public class Juego extends JFrame {

	private JPanel contentPane;
	private int dificultad = 0;
	private JButton[] secreto;
	private JButton[] btnColoresDisp = new JButton[5];
	private JButton[][] botonJuego = new JButton[5][5];
	private JButton[][] botonCompr = new JButton[5][5];
	private ArrayList<Color> coloresDisp = new ArrayList<Color>();
	private int conti = 0, contj = 0, icompr = 0;
	
	
	public Juego(JButton[] secreto) {
			
			coloresDisp.add(Color.WHITE);
			coloresDisp.add(Color.RED);
			coloresDisp.add(Color.ORANGE);
			coloresDisp.add(new Color(0, 128, 0));
			coloresDisp.add(Color.BLUE);
			coloresDisp.add(Color.PINK);
		
			this.secreto = secreto;
		
			setTitle("Mastermind");
			
			setBounds(600, 115, 800, 900);
			
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			setVisible(true);
			
			contentPane = new JPanel();
			
			contentPane.setLayout(null);
			
			setContentPane(contentPane);
			
			JLabel tituloSec = new JLabel("Combinación secreta: ");
			tituloSec.setBounds(580, 55, 150, 20);
			contentPane.add(tituloSec);
			
			JLabel tituloColor = new JLabel("Colores disponibles: ");
			tituloColor.setBounds(580, 155, 150, 20);
			contentPane.add(tituloColor);
			
			JButton boton = new JButton("Comprobar");
			 boton.setBounds(350, 775, 120, 40);
			 boton.setMnemonic(KeyEvent.VK_ENTER);
			 contentPane.add(boton);
			 boton.addActionListener(new ActionListener(){			
				public void actionPerformed(ActionEvent e) {
					
					conti = 0;
					contj++;
					contieneColor();
						
				}
			});
			
			for (int i = 0; i < 5; i++) {
				contentPane.add(secreto[i]);
			}
			
			secreto[0].setBounds(570, 80, 30, 30);
			secreto[1].setBounds(600, 80, 30, 30);
			secreto[2].setBounds(630, 80, 30, 30);
			secreto[3].setBounds(660, 80, 30, 30);
			secreto[4].setBounds(690, 80, 30, 30);
			
			for (int i = 0; i < 5;i++) {				
				btnColoresDisp[i] = new JButton("");
				contentPane.add(btnColoresDisp[i]);		
				btnColoresDisp[i].addMouseListener(new Resultado());
				btnColoresDisp[i].setBackground(coloresDisp.get(i+1));
			}
			
			btnColoresDisp[0].setBounds(570, 180, 30, 30);
			btnColoresDisp[1].setBounds(600, 180, 30, 30);
			btnColoresDisp[2].setBounds(630, 180, 30, 30);
			btnColoresDisp[3].setBounds(660, 180, 30, 30);
			btnColoresDisp[4].setBounds(690, 180, 30, 30);
			
			for (int i = 0; i < 5;i++) {				
				for (int j = 0; j < 5;j++) {		
					botonJuego[i][j] = new JButton("");
					contentPane.add(botonJuego[i][j]);					
				}				
			}
			
			
			int x = 70, y = 80;
			
			for (int i = 0; i < 5;i++) {				
				for (int j = 0; j < 5;j++) {									
					botonJuego[i][j].setBounds(x, y, 30, 30);	
					x = x + 40;
				}
				
				System.out.println(x);
				x = x - 200;
				y = y + 100;
			}
			
			
			
			for (int i = 0; i < 5;i++) {				
				for (int j = 0; j < 5;j++) {		
					botonCompr[i][j] = new JButton("");
					contentPane.add(botonCompr[i][j]);	
					botonCompr[i][j].setBackground(Color.black);
				}				
			}
			
			
			int x2 = 320, y2 = 80;
			
			for (int i = 0; i < 5;i++) {				
				for (int j = 0; j < 5;j++) {									
					botonCompr[i][j].setBounds(x2, y2, 30, 30);	
					x2 = x2 + 40;
				}
				
				System.out.println(x);
				x2 = x2 - 200;
				y2 = y2 + 100;
			}
			
	}
	
	public class Resultado implements MouseListener {
		@Override
		public void mouseClicked(MouseEvent e) {

			
				if (e.getSource().equals(btnColoresDisp[0])) {
					botonJuego[contj][conti].setBackground(Color.RED);

				} else if (e.getSource().equals(btnColoresDisp[1])) {
					botonJuego[contj][conti].setBackground(Color.ORANGE);

				} else if (e.getSource().equals(btnColoresDisp[2])) {
					botonJuego[contj][conti].setBackground(new Color(0, 128, 0));

				} else if (e.getSource().equals(btnColoresDisp[3])) {
					botonJuego[contj][conti].setBackground(Color.BLUE);

				} else if (e.getSource().equals(btnColoresDisp[4])) {
					botonJuego[contj][conti].setBackground(Color.PINK);
					
				}
				
				conti++;
				
				if(conti==5) {
					conti=0;
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
	
	public boolean contieneColor() {
		
		icompr = 0;
	
		boolean res = false;
				
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<5; j++) {
				if(secreto[j].getBackground().equals(botonJuego[contj][i].getBackground())) {
					
					botonCompr[contj][icompr].setBackground(Color.WHITE);
					
					res = true;
				}
			}
		}
		
		System.out.println(res);
		
		return res;
		
	}
	
}
