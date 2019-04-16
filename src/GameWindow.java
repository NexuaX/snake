import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.OverlayLayout;
import javax.swing.Timer;

public class GameWindow extends JFrame implements ActionListener{
	
	private GameBoard board;
	private SnakeComponent snake;
	private FruitComponent fruit;
	private EndCreditsScreen endScreen;
	private GameFunctionality func;
	private Timer timer;

	public GameWindow(String title) {
		super(title);
		initFrame();
	}

	private void initFrame() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new OverlayLayout(getContentPane()));
		
		board = new GameBoard();
		snake = new SnakeComponent();
		fruit = new FruitComponent();
		endScreen = new EndCreditsScreen();
		endScreen.setVisible(false);
		add(board, 0);
		add(fruit, 0);
		add(snake, 0);
		add(endScreen, 0);
		
		pack();
		
		setLocationRelativeTo(null);
		setVisible(true);
		
		gameStart();
	}
	
	public void gameStart() {
		func = new GameFunctionality(250);
		addKeyListener(func.getAdapter());
		timer = new Timer(func.getDelay(), this);
		timer.start();
	}
	
	private void gameEnd() {
		timer.stop();
		endScreen.setResult(func.getPoints());
		endScreen.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		func.move(snake.getSnake());
		if (!func.checkMove(snake.getSnake())) {
			gameEnd();
		}
		func.isFruit(fruit.getFruit(), snake.getSnake());
		snake.repaint();
		fruit.repaint();
	}
	
	public GameBoard getBoard() {
		return board;
	}
	
	public SnakeComponent getSnake() {
		return snake;
	}

}
