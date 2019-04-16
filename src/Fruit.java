import java.util.Random;

public class Fruit {

	private int x;
	private int y;
	
	public Fruit() {
		generateRandom();
	}
	
	public void generateRandom() {
		Random rand = new Random();
		x = rand.nextInt(25);
		y = rand.nextInt(25);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
}
