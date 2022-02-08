package javase.learning.oops.composition;

public class Brain {
	
	private int numOfNuerons;
	private boolean quality;
	
	public Brain(int numOfNuerons, boolean quality) {
		this.numOfNuerons = numOfNuerons;
		this.quality = quality;
	}

	public int getNumOfNuerons() {
		return numOfNuerons;
	}

	public void setNumOfNuerons(int numOfNuerons) {
		this.numOfNuerons = numOfNuerons;
	}

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}
}
