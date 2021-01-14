package Inhirect;

public class Vehicle {

	private String name;
	private String type;
	private String fast;
	public Vehicle(String name, String type, String fast) {
		this.name = name;
		this.type = type;
		this.fast = fast;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @return the fast
	 */
	public String getFast() {
		return fast;
	}

}
