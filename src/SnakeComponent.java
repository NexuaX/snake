import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class SnakeComponent extends JPanel {

	private Snake snake;
	
	public SnakeComponent() {
		setPreferredSize(new Dimension(500,500));
		setOpaque(false);
		setBackground(new Color(0, 0, 0, 0));
		snake = new Snake();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics g2d = (Graphics2D) g;
		
		int x, y;
		
		for (int i = 0; i < snake.length; i++) {
			x = snake.getXOf(i)*20;
			y = snake.getYOf(i)*20;
			g2d.fillOval(x, y, 20, 20);
		}
	}

	public Snake getSnake() {
		return snake;
	}
	
}
