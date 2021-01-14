package Wall;

public class Wall {

	private double width;
	private double height;
	
	public Wall() {
		this.width = 0;
		this.height = 0;
	}
	
	public Wall(double width, double height) {
		setWidth(width);
		setHeight(height);

	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		if(width < 0) {
			this.width = 0;
		} else this.width = width;
		
	}
	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		if(height < 0) {
			this.height = 0;
		} else {
		this.height = height;
		}
	}
	
	public double getArea() {
		return this.width * this.height;
	}
	
	
}
