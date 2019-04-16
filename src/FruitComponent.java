import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class FruitComponent extends JPanel {

	private Fruit fruit;
	
	public FruitComponent() {
		setPreferredSize(new Dimension(500,500));
		setOpaque(false);
		setBackground(new Color(0, 0, 0, 0));
		fruit = new Fruit();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics g2d = (Graphics2D) g;
		
		int x = fruit.getX()*20;
		int y = fruit.getY()*20;
		
		g2d.setColor(Color.red);
		
		g2d.fillOval(x, y, 20, 20);
	}

	public Fruit getFruit() {
		return fruit;
	}
	
	
	
}
