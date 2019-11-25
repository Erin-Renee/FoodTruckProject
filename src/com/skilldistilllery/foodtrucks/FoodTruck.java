package com.skilldistilllery.foodtrucks;

public class FoodTruck {
	private int trucknum = 5;
	private String truckName;
	private  String foodType;
	private int rating;
	
	public FoodTruck (int trucks, String truckName, String foodType, int rating) {
		this.trucknum = 5;
		this.truckName = truckName;
		this.foodType = foodType;
		this.rating = rating;
	}

	public int getNumericID() {
		return trucknum;
	}

	public void setTruckNumber(int trucknum) {
		this.trucknum = trucknum;
	}

	public String getTruckName() {
		return truckName;
	}

	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	
}
