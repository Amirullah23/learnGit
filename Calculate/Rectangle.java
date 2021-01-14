package Calculate;

public class Rectangle {
	private double width;
	private double length;
	
	public Rectangle(double width, double length) {
		this.width = width < 0 ? 0 : width;
		this.length = length < 0 ? 0 : length;
	}
	
	


	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}



	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}
	
	public double getArea() {
		return getWidth() * getLength();
	}

}
