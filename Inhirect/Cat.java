package Inhirect;

public class Cat extends Animal {
	private static  String color2 = ":";
	private String color;
	private boolean cute;

	public Cat() {	
		Cat.color2 = "fr";
	}
	
	public Cat(String color, boolean cute) {
		this.color = color;
		this.cute = cute;
	}
	
	public void print() {
		System.out.println(this.color + this.cute + " cat");
	}
	
	public void show() {
		System.out.println("name : "+ getName()+ " age : "+ getAge() + "hidup : " + isLive()
		+ " color : " + color + " cute : " + cute
			+ "color static :" + color2	);
	}
	
	


	

	
	
	

}
