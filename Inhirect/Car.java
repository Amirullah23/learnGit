package Inhirect;

public class Car extends Vehicle {

	private String model;
	private String roda;
	
	// default Car
	public Car() {
		super("Car", "darat", "sedang");
	}
	
	public Car(String name, String type, String fast) {
		super(name, type, fast);
		// TODO Auto-generated constructor stub
	}

	public Car(String name, String type, String fast, String model, String roda) {
		super(name, type, fast);
		this.model = model;
		this.roda = roda;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @return the roda
	 */
	public String getRoda() {
		return roda;
	}
	
	
	
	
	
}
