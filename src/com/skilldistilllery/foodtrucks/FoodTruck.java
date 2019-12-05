package com.skilldistilllery.foodtrucks;

public class FoodTruck {
	private static int trucknum=1;
	private String truckName;
	private  String foodType;
	private int rating;
	private int ID;
	
	public FoodTruck (String truckName, String foodType, int rating) {
		this.truckName = truckName;
		this.foodType = foodType;
		this.rating = rating;
		this.ID = trucknum;
		trucknum++;
	}

	public int getNumericID() {
		return trucknum;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
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

	@Override
	public String toString() {
		return "FoodTruck ID = " + ID + " truckName= " + truckName + ", foodType= " + foodType + ", rating= " + rating + " ]";
	}

	
}
