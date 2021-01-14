package Inhirect;

public class Animal {
	public Animal() {
		System.out.println("constructor no param called");
	}
	
	private String name;
	private int age;
	private boolean live;
	

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @return the live
	 */
	public boolean isLive() {
		return live;
	}

	public Animal(String name, int age, boolean live) {
		System.out.println("constructor param called");
		this.name = name;
		this.age = age;
		this.live = live;
	}
	
	public void eat() {
		System.out.println(name + " age "+ age + " eating food");	
	}
	
	

}
