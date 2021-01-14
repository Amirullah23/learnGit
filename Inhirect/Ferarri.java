package Inhirect;

public class Ferarri extends Car {

	public Ferarri() {
		super("Ferarri", "darat", "cepat++", "sport", "4");
		
		// TODO Auto-generated constructor stub
	}
	
	public void showCar() {
		System.out.println(
			" name : " + getName()+
			" type : " + getType()+	
			" fast : " + getFast()+	
			" model : " + getModel()+	
			" roda : " + getRoda()	
			
				);
		
	}

}
