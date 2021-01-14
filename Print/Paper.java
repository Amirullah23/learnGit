package Print;

public class Paper {
	
	private String name;
	private int stock;
	public Paper(String name, int stock) {
//		super();
		this.name = name;
		this.stock = stock;
	}
	public String getName() {
		return name;
	}
	public int getStock() {
		return stock;
	}
	
	public void minPaper(int sum) {
		this.stock -= sum;
	}
	
	
	
	

}
