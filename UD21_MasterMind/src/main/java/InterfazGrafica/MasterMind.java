package InterfazGrafica;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout.*;
import javax.swing.LayoutStyle.*;

public class MasterMind extends JFrame {

	JButton rojo = new JButton("");
	JButton naranja = new JButton("");
	JButton verde = new JButton("");
	JButton azul = new JButton("");
	JButton rosa = new JButton("");
	
	JButton[] secreto = new JButton[5];
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MasterMind frame = new MasterMind();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MasterMind() {
		
		setTitle("Master Mind");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(30, 30, 538, 170);
		
		JLabel lblNewLabel = new JLabel("Estos son los colores disponibles: ");
		
		rojo.setForeground(Color.RED);
		rojo.setBackground(Color.RED);
		rojo.addMouseListener(new Resultado());
		
		naranja.setForeground(Color.ORANGE);
		naranja.setBackground(Color.ORANGE);
		naranja.addMouseListener(new Resultado());
		
		verde.setForeground(new Color(0, 128, 0));
		verde.setBackground(new Color(0, 128, 0));
		verde.addMouseListener(new Resultado());
		
		azul.setForeground(Color.BLUE);
		azul.setBackground(Color.BLUE);
		azul.addMouseListener(new Resultado());
		
		rosa.setForeground(Color.PINK);
		rosa.setBackground(Color.PINK);
		rosa.addMouseListener(new Resultado());
		
		JLabel lblCombinacionSecreta = new JLabel("Combinacion secreta:");
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addComponent(lblCombinacionSecreta))
					.addGap(4)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(rojo, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(naranja, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(verde, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(azul, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(rosa, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addPreferredGap(ComponentPlacement.UNRELATED)
					.addContainerGap(106, Short.MAX_VALUE))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblCombinacionSecreta, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(28)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(rojo, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
								.addComponent(naranja, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(verde, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(azul, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(rosa, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING))))
					.addContainerGap(211, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
	}
	
	public class Resultado implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {
            
        	if(e.getSource()==rojo) {
        		
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
