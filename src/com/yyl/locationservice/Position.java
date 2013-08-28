package com.yyl.locationservice;

public class Position {
	private double longtitude;
	private double latitude;
	
	public Position(){
	
	}
	
	public Position(double longtitude, double latitude) {
		super();
		this.longtitude = longtitude;
		this.latitude = latitude;
	}
	
	public double getLongtitude() {
		return longtitude;
	}
	
	public void setLongtitude(double longtitue) {
		this.longtitude = longtitue;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
}
