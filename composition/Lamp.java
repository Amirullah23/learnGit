package composition;

public class Lamp {
	private String style;
	private boolean battery;
	private int globRating;
	
	
	
	public Lamp(String style, boolean battery, int globRating) {
//		super();
		this.style = style;
		this.battery = battery;
		this.globRating = globRating;
	}

	public void turnOn() {
		System.out.println("Lamp -> turning on");
	}

	/**
	 * @return the style
	 */
	public String getStyle() {
		return style;
	}

	/**
	 * @return the battery
	 */
	public boolean isBattery() {
		return battery;
	}

	/**
	 * @return the globRating
	 */
	public int getGlobRating() {
		return globRating;
	}
	
	
	
	

}
