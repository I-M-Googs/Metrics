package golfmetrics;

public enum Strokes {
	ONE("One", 1),
	TWO("Two", 2),
	THREE("Three", 3),
	FOUR("Four", 4),
	FIVE("Five", 5);
	
	private final String numString;
	private final int numLost;
	
	private Strokes(String numString, int numLost) {
		this.numString = numString;
		this.numLost= numLost;
	}
	
	public String getNumString() {
		return this.numString;
	}
	
	public int getStrokesLost() {
		return this.numLost;
	}

}
