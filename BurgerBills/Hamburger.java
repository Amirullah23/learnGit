package BurgerBills;

public class Hamburger {
	// basic variable
	private String name;
	private String meat;
	private double price;
	private String breadRollType;
	
	// additional variable
	private String addition1Name;
	private double addition1Price;
	private String addition2Name;
	private double addition2Price;
	private String addition3Name;
	private double addition3Price;
	private String addition4Name;
	private double addition4Price;
	
	public Hamburger(String name, String meat, double price, String breadRollType) {
		this.name = name;
		this.meat = meat;
		this.price = price;
		this.breadRollType = breadRollType;
		System.out.println(this.name +" hamburger on a "+this.breadRollType+" roll with "+this.meat+", price is "+ this.price);
	}
	
	//additions methods
	
	public void addHamburgerAddition1(String name, double price) {
		this.addition1Name = name;
		this.addition1Price = price;
		System.out.println("Added " +this.addition1Name+" for an extra "+addition1Price);
	}
	
	public void addHamburgerAddition2(String name, double price) {
		this.addition2Name = name;
		this.addition2Price = price;
		System.out.println("Added " +this.addition2Name+" for an extra "+addition2Price);
	}
	
	public void addHamburgerAddition3(String name, double price) {
		this.addition3Name = name;
		this.addition3Price = price;
		System.out.println("Added " +this.addition3Name+" for an extra "+addition3Price);
	}
	
	public void addHamburgerAddition4(String name, double price) {
		this.addition4Name = name;
		this.addition4Price = price;
		System.out.println("Added " +this.addition4Name+" for an extra "+addition4Price);
	}
	
	public double itemizeHamburger() {
		return price + addition1Price + addition2Price + addition3Price +  addition4Price;
	}
	

	
	

}
