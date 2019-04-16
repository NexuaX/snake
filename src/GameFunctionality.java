import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameFunctionality {

	private enum Directions {
		UP, RIGHT, DOWN, LEFT;
	}
	private Directions direction;
	private int delay;
	private DirectionAdapter adapter;
	private int points;

	public GameFunctionality(int moveDelay) {
		direction = Directions.UP;
		delay = moveDelay;
		adapter = new DirectionAdapter();
		points = 0;
	}

	public void move(Snake snake) {
		for (int i = snake.length; i > 0; i--) {
			snake.setXOf(i, snake.getXOf(i-1));
			snake.setYOf(i, snake.getYOf(i-1));
		}
		
		int snakeHeadX = snake.getXOf(0);
		int snakeHeadY = snake.getYOf(0);
		
		switch(direction) {
			case UP: 
				snake.setHeadY(snakeHeadY - 1);
				break;
			case RIGHT:
				snake.setHeadX(snakeHeadX + 1);
				break;
			case DOWN:
				snake.setHeadY(snakeHeadY + 1);
				break;
			case LEFT:
				snake.setHeadX(snakeHeadX - 1);
		}
	}
	
	public boolean checkMove(Snake snake) {
		for (int i = 1; i < snake.length; i++) {
			if (snake.getXOf(0) == snake.getXOf(i) && snake.getYOf(0) == snake.getYOf(i)) {
				return false;
			}
		}
		if (snake.getXOf(0) == 25 || snake.getXOf(0) == -1) {
			return false;
		} else if (snake.getYOf(0) == 25 || snake.getYOf(0) == -1) {
			return false;
		}
 		return true;
	}
	
	public void isFruit(Fruit fruit, Snake snake) {
		if (fruit.getX() == snake.getXOf(0) && fruit.getY() == snake.getYOf(0)) {
			snake.eatFruit();
			fruit.generateRandom();
			points++;
		}
	}
	
	private class DirectionAdapter extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {
			int code = e.getKeyCode();
			
			switch(code) {
				case KeyEvent.VK_UP:
					direction = Directions.UP;
					break;
				case KeyEvent.VK_RIGHT:
					direction = Directions.RIGHT;
					break;
				case KeyEvent.VK_DOWN:
					direction = Directions.DOWN;
					break;
				case KeyEvent.VK_LEFT:
					direction = Directions.LEFT;
					break;
				default:
					break;
			}
		}
		
	}

	public int getDelay() {
		return delay;
	}
	
	public DirectionAdapter getAdapter() {
		return adapter;
	}
	
	public int getPoints() {
		return points;
	}
	
}
