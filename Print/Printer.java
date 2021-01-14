package Print;

public class Printer {
	
	private Paper paper;
	private Ink ink;
	
	public Printer(Paper paper, Ink ink) {
//		super();
		this.paper = paper;
		this.ink = ink;
	}
	
	public void printNow(int sumOfpr, int color, int black) {
		
		if(validPaper(sumOfpr) && validInkBlck(black) && validInkColor(color)) {
			this.paper.minPaper(sumOfpr);
			System.out.println("print progress");
			System.out.println("print done");
			System.out.println("paper available is " + this.paper.getStock()
					+ " ink black available is " + this.ink.getBlack()
					+ " ink color available is " + this.ink.getColor()
					);
		}
		
		if(!validPaper(sumOfpr)) {
			System.out.println("paper not enough");
		}
		
		if(!validInkBlck(black)) {
			System.out.println("ink black not enough");
		}
		
		if(!validInkColor(color)) {
			System.out.println("ink color not enough");
		}
		
		
		
	}
	
	// validation
	private boolean validPaper(int paper) {
		return this.paper.getStock() > paper ? true : false;
	}
	
	private boolean validInkBlck(int ink) {
		return this.ink.getBlack() > ink ? true : false;
	}
	
	private boolean validInkColor(int ink) {
		return this.ink.getColor() > ink ? true : false;
	}
	
	
	

	
}
