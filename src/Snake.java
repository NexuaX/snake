
public class Snake {
	
	private int[] x = new int[25];
	private int[] y = new int[25];
	public int length;
	
	public Snake() {
		initCords();
	}
	
	private void initCords() {
		length = 3;
		for (int i = 0; i < length; i++) {
			x[i] = 20;
			y[i] = 20 + i;
		}
	}
	
	public void eatFruit() {
		length++;
	}

	public int[] getX() {
		return x;
	}

	public int[] getY() {
		return y;
	}

	public int getXOf(int dot) {
		return x[dot];
	}

	public int getYOf(int dot) {
		return y[dot];
	}
	
	public void setXOf(int dot, int cord) {
		x[dot] = cord;
	}
	
	public void setYOf(int dot, int cord) {
		y[dot] = cord;
	}

	public void setHeadX(int cord) {
		x[0] = cord;
	}
	
	public void setHeadY(int cord) {
		y[0] = cord;
	}

	
}
