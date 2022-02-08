package javase.learning.oops.composition;

public class Heart {
	
	private int numOfRooms;
	private boolean quality;
	
	public Heart(int numOfRooms, boolean quality) {
		this.numOfRooms = numOfRooms;
		this.quality = quality;
	}

	public int getNumOfRooms() {
		return numOfRooms;
	}

	public void setNumOfRooms(int numOfRooms) {
		this.numOfRooms = numOfRooms;
	}

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}
	
}
