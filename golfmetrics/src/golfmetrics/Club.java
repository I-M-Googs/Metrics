package golfmetrics;

public enum Club {
	DRIVER("Driver"),
	FAIRWAY("Fairway"),
	HYBRID("Hybrid"),
	IRON("Iron"),
	WEDGE("Wedge"),
	PUTTER("Putter");
	
	private final String club;
	
	private Club(String club) {
		this.club = club;
	}
	
	public String getClub() {
		return this.club;
	}
}
