import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class EndCreditsScreen extends JPanel {
	
	private int result;
	
	public EndCreditsScreen() {
		setPreferredSize(new Dimension(500,500));
		setBackground(new Color(30, 30, 30, 100));
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics g2d = (Graphics2D) g;
		
		Font font = new Font("Helvetica", Font.BOLD, 24);
		FontMetrics size = getFontMetrics(font);
		g2d.setFont(font);
		g2d.setColor(Color.white);
		
		String msg = "Koniec gry";
		String info = "Wynik: "+result;
		
		g2d.drawString(msg, (500 - size.stringWidth(msg)) /2, 200);
		g2d.drawString(info, (500 - size.stringWidth(info)) /2, 250);
	}
	
	public void setResult(int result) {
		this.result = result;
	}
	
}
