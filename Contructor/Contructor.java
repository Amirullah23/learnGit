package Contructor;

public class Contructor {
	private String name;
	private int num;
	private int no;
	public Contructor() {
		this("amir", 123, 456);
	}
	
	public Contructor(int num, int no) {
		this("amir", num, no);
	}
	
	public Contructor(String name, int num, int no) {

		this.name = name;
		this.num = num;
		this.no = no;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}
	/**
	 * @return the no
	 */
	public int getNo() {
		return no;
	}

}
