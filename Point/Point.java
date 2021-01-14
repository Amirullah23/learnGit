package Point;

public class Point {
	
	private int x;
	private int y;
	
	public Point() {
		
	}

	public Point(int x, int y) {
		
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;}
	
	
	public double distance(int x, int y) {
		int xX = x - this.x;
		int yY = y - this.y;
		double eksX = Math.pow(xX, 2);
		double eksY = Math.pow(yY, 2);
		double rslt = eksX + eksY;
		
		
		return Math.sqrt(rslt);
	}
	
	public double distance(Point c) {
		int xX = c.x - this.x;
		int yY = c.y - this.y;
		double eksX = Math.pow(xX, 2);
		double eksY = Math.pow(yY, 2);
		double rslt = eksX + eksY;
		
		
		return Math.sqrt(rslt);
	}
	
}
	

