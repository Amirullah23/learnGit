package Calculate;

public class CarpetCostCalculate {
	private double width;
	private double length;
	public CarpetCostCalculate(double width, double length) {
		
		if(width < 0 && length < 0) {
			this.width = 0;
			this.length = 0;}
		else if(width < 0) {this.width = 0; this.length = length;}
		else if(length < 0) {this.length = 0; this.width = width;}
		
	}
	public void show() {
		System.out.println(width);
		System.out.println(length);
	}
	
	public double getArea() {
		return this.width * this.length;
	}
	
	
	
	

}

class Carpet {
	private double cost;

	public Carpet(double cost) {
		if(cost < 0) {
			this.cost = 0;
		} else {
//		super();
		this.cost = cost;
		}
	}

	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}

	
}

class Calculator {
	private CarpetCostCalculate floor;
	private Carpet carpet;
	public Calculator(CarpetCostCalculate floor, Carpet carpet) {
//		super();
		this.floor = floor;
		this.carpet = carpet;
	}
	public double getTotalCost(){
		double fl = floor.getArea();
		double cr = carpet.getCost();
	    return fl * cr;
	}
	
	
}
