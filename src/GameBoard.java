import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class GameBoard extends JPanel {
	
	public GameBoard() {
		setPreferredSize(new Dimension(500,500));
		setBackground(new Color(190, 190, 170));
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics g2d = (Graphics2D) g;
		
		for (int i = 0; i < 500; i+=20) {
			for (int j = 0; j < 500; j+=20) {
				g2d.drawRect(i, j, 20, 20);
			}
		}
	}

}
