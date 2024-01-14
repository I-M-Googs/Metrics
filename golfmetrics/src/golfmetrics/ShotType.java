package golfmetrics;

public enum ShotType {
	FULL("Full"),
	FAIRWAYBUNKER("Fairway Bunker"),
	RECOVERY("Recovery"),
	PITCH("Pitch"),
	CHIP("Chip"),
	GREENSIDEBUNKER("Green Side Bunker"),
	PUTT("Putt");
	
	private final String shotType;
	
	private ShotType(String shotType) {
		this.shotType = shotType;
	}
	
	public String getShotType() {
		return this.shotType;
	}
}
