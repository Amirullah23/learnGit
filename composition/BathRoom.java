package composition;

public class BathRoom {
	private Size size;
	private int toilet;
	private boolean hasShower;
	private boolean locked;
	public BathRoom(Size size, int toilet, boolean hasShower, boolean locked) {
//		super();
		this.size = size;
		this.toilet = toilet;
		this.hasShower = hasShower;
		this.locked = locked;
	}
	
	public void hasSomeone() {
		if(locked) {
			System.out.println("bathroom is locked");
		} else {
			System.out.println("u can enter");
		}
	}

}
