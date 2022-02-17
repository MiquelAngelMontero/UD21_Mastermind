package InterfazGrafica;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.*;
/**
 * 
 * @author Eloy, Miquel Angel, Jordi
 *
 */
public class Juego3 extends JFrame {

	private JPanel contentPane;
	private int dificultad;
	private JButton[] secreto3;
	private JButton[] btnColoresDisp = new JButton[5];
	public JButton[][] botonJuego = new JButton[5][7];
	private JButton[][] botonCompr = new JButton[5][7];
	private ArrayList<Color> coloresDisp = new ArrayList<Color>();
	private ArrayList<Point> botonesAdivinados = new ArrayList<Point>();
	public int conti = 0, contj = 0, icompr = 0;
	
	
	public Juego3(JButton[] secreto3, int dificultad) {
			
			coloresDisp.add(Color.WHITE);
			coloresDisp.add(Color.RED);
			coloresDisp.add(Color.ORANGE);
			coloresDisp.add(new Color(0, 128, 0));
			coloresDisp.add(Color.BLUE);
			coloresDisp.add(Color.PINK);
		
			this.secreto3 = secreto3;
			this.dificultad = dificultad;
		
			setTitle("Mastermind");
			
			setBounds(700, 40, 950, 900);
			
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			setVisible(true);
			
			contentPane = new JPanel();
			
			contentPane.setLayout(null);
			
			setContentPane(contentPane);
			
			JLabel tituloSec = new JLabel("Combinación secreta: ");
			tituloSec.setBounds(640, 55, 150, 20);
			contentPane.add(tituloSec);
			
			JLabel tituloColor = new JLabel("Colores disponibles: ");
			tituloColor.setBounds(640, 155, 150, 20);
			contentPane.add(tituloColor);
			
			JLabel comprobacion = new JLabel("Comprobación: ");
			comprobacion.setBounds(360, 55, 150, 20);
			contentPane.add(comprobacion);
			
			JLabel combi = new JLabel("Combinación: ");
			combi.setBounds(70, 55, 150, 20);
			contentPane.add(combi);
			
			JButton boton = new JButton("Comprobar");
			 boton.setBounds(350, 775, 120, 40);
			 boton.setMnemonic(KeyEvent.VK_ENTER);
			 contentPane.add(boton);
			 boton.addActionListener(new ActionListener(){			
				public void actionPerformed(ActionEvent e) {
					
					botonesAdivinados.clear();
					conti = 0;
					posicionCorrecta();
					contieneColor();
					contj++;
					
				}
			});
			
			for (int i = 0; i < 7; i++) {
				contentPane.add(secreto3[i]);
			}
			
			secreto3[0].setBounds(670, 80, 30, 30);
			secreto3[1].setBounds(700, 80, 30, 30);
			secreto3[2].setBounds(730, 80, 30, 30);
			secreto3[3].setBounds(760, 80, 30, 30);
			secreto3[4].setBounds(790, 80, 30, 30);
			secreto3[5].setBounds(820, 80, 30, 30);
			secreto3[6].setBounds(850, 80, 30, 30);
			
			for (int i = 0; i < 5;i++) {				
				btnColoresDisp[i] = new JButton("");
				contentPane.add(btnColoresDisp[i]);		
				btnColoresDisp[i].addMouseListener(new Resultado());
				btnColoresDisp[i].setBackground(coloresDisp.get(i+1));
			}
			
			btnColoresDisp[0].setBounds(670, 180, 30, 30);
			btnColoresDisp[1].setBounds(700, 180, 30, 30);
			btnColoresDisp[2].setBounds(730, 180, 30, 30);
			btnColoresDisp[3].setBounds(760, 180, 30, 30);
			btnColoresDisp[4].setBounds(790, 180, 30, 30);
			
			for (int i = 0; i < 5;i++) {				
				for (int j = 0; j < 7;j++) {		
					botonJuego[i][j] = new JButton("");
					contentPane.add(botonJuego[i][j]);
				}				
			}
			
			
			int x = 70, y = 80;
			
			for (int i = 0; i < 5;i++) {				
				for (int j = 0; j < 7;j++) {									
					botonJuego[i][j].setBounds(x, y, 30, 30);	
					x = x + 40;
				}
				
				System.out.println(x);
				x = 70;
				y = y + 100;
			}
			
			
			
			for (int i = 0; i < 5;i++) {				
				for (int j = 0; j < 7;j++) {		
					botonCompr[i][j] = new JButton("");
					contentPane.add(botonCompr[i][j]);	
					botonCompr[i][j].setBackground(Color.black);
				}				
			}
			
			
			int x2 = 360, y2 = 80;
			
			for (int i = 0; i < 5;i++) {				
				for (int j = 0; j < 7;j++) {									
					botonCompr[i][j].setBounds(x2, y2, 30, 30);	
					x2 = x2 + 40;
				}
				
				System.out.println(x);
				x2 = 360;
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
				
				if(conti==7) {
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
	
	public boolean posicionCorrecta() {
		
		icompr = 0;
		
		boolean res = false;
			
			for(int i = 0; i<5; i++) {
					if(secreto3[i].getBackground().equals(botonJuego[contj][i].getBackground()) && (!botonesAdivinados.contains(secreto3[i].getLocation()))  && (!botonesAdivinados.contains(botonJuego[contj][i].getLocation()))) {					
						botonCompr[contj][icompr].setBackground(Color.YELLOW);
						botonesAdivinados.add(secreto3[i].getLocation());
						botonesAdivinados.add(botonJuego[contj][i].getLocation());
						icompr++;
						res = true;
					}
			}
			
			System.out.println(res);
			
			return res;
		
	}
	
	public boolean contieneColor() {
		
		boolean res = false;
		
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<7; j++) {
				if(secreto3[j].getBackground().equals(botonJuego[contj][i].getBackground()) && (!botonesAdivinados.contains(secreto3[j].getLocation()))  && (!botonesAdivinados.contains(botonJuego[contj][i].getLocation()))) {					
					botonCompr[contj][icompr].setBackground(Color.WHITE);
					botonesAdivinados.add(secreto3[j].getLocation());
					botonesAdivinados.add(botonJuego[contj][i].getLocation());
					icompr++;
					res = true;
				}
			}
		}
		
		return res;
		
	}
	
}