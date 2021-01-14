package Main;

public class Printer {
	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;
	
	public Printer(int tonerLevel, boolean duplex) {
//		super();
		if(tonerLevel > -1 && tonerLevel <= 100) {
			this.tonerLevel = tonerLevel;
			
		} else {
			this.tonerLevel = -1;	
		}
		
		this.duplex = duplex;
		this.pagesPrinted = 0;
	}
	
	public int addToner(int tonerAmout) {
		if(tonerAmout > 0 && tonerAmout <= 100) {
			if(tonerAmout + this.tonerLevel > 100) {
				return -1;
			} 
				this.tonerLevel += tonerAmout;
				return this.tonerLevel;
			
		} else {
			return -1;
		}
	}
	
	public int printPages(int pages) {
		int pagesToPrint = pages;
		if(duplex) {
			pagesToPrint = pages / 2;
			pagesToPrint += pages % 2;
		
		}
	
		pagesPrinted += pagesToPrint;
		return pagesToPrint;
	}

	public int getPagesPrinted() {
		return pagesPrinted;
	}
	
	
	
	
	
	
	
	
	

}
