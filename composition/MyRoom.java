package composition;

public class MyRoom {
	private BathRoom bathRoom;
	private Bedroom bedRoom;
	public MyRoom(BathRoom bathRoom, Bedroom bedRoom) {
//		super();
		this.bathRoom = bathRoom;
		this.bedRoom = bedRoom;
	}
	
	public void gotoBathRoom() {
		bathRoom.hasSomeone();
	}

	/**
	 * @return the bedRoom
	 */
	public Bedroom getBedRoom() {
		return bedRoom;
	}
	
	public void gotoSleep() {
//		getBedRoom().goSleep();
	}
	
	
	
	

}
