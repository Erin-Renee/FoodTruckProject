package com.skilldistilllery.foodtrucks;

import java.util.Scanner;

public class FoodTrucksApp {
	private FoodTruck[] foodtruck;
	int trucks = 5;

	public static void main(String[] args) {
		//Scanner kb = new Scanner(System.in);
		FoodTrucksApp app = new FoodTrucksApp();
		app.run();
	}
	
	public FoodTrucksApp () {
		this.foodtruck = new FoodTruck[6]; 
		
	}
	

	public void run ( ) {
		
	}
	public void FoodTrucksInput ( String foodtruck) {
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome to Food Truck Rater ");
		for (int i=0; i <foodtruck.length; i++) {
			System.out.println("please Enter food truck name " + i + ": ");
			System.out.println("input \"quit\" to exit program");
			truckName = kb.next().toLowerCase();
			if (truckName == "quit" ) {
				System.out.println("goodbye");
				break;
			}
			System.out.print("please enter the type of food served: ");
			foodType = kb.next().toLowerCase();
			System.out.println("Please enter food truck rating: ");
			int rating = kb.nextInt();
		} 
	
		
}
	public void menu (Scanner kb, String Foodtruck) {
		System.out.println("----------------------");
		System.out.println("Main Menu");
		System.out.println("foodtruck " + foodtruck);
		System.out.println();
		System.out.println();
		System.out.println("----------------------");
	}
	public void goodBye () {
		System.out.println("GoodBye");
	}
	
	}




/*
 * foodtruck [0] = NachoBusiness; foodtruck [1] = IDreamOfWeenie; foodtruck [2]
 * = BaconMeCrazy; foodtruck [3] = CheeseLouise; foodtruck [4] = CrepenAround;
 */