import java.awt.EventQueue;

import javax.swing.JFrame;

public class StartPoint {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				GameWindow game = new GameWindow("Snake Game");
			}
		});

	}
	
}
