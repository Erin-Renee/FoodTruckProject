package com.skilldistilllery.foodtrucks;

import java.util.Scanner;

public class FoodTrucksApp {
	private FoodTruck[] foodtruck;
	Scanner kb = new Scanner(System.in);
	/*
	 * protected String truckName; protected String foodType; protected int rating;
	 */

	public static void main(String[] args) {
		// Scanner kb = new Scanner(System.in);
		FoodTrucksApp app = new FoodTrucksApp();
		app.run();
	}

	public FoodTrucksApp() {
		this.foodtruck = new FoodTruck[6];

	}

	public void run() {
		FoodTrucksInput();
		boolean menureturn = true;
		while (menureturn) {
			menu();
			int choice = kb.nextInt();

			switch (choice) {
			case 1:
				listTrucks();
				break;
			case 2:
				highestRating();
				break;
			case 3:
				System.out.println("The average rating is: " + averageRating(foodtruck));
				break;
			case 4:
				goodBye();
				menureturn = false;
				break;
			default:
				System.out.println("please Enter a choice (1-4)");
			}
		}
	}

	public void FoodTrucksInput() {

		System.out.println("Welcome to Food Truck Rater ");
		for (int i = 0; i < foodtruck.length; i++) {
			System.out.println("please Enter food truck name " + (i + 1) + "(enter \"quit\" to quit): ");

			String truckName = kb.nextLine().toLowerCase();
			if (truckName.contentEquals("quit")) {
				goodBye();
				break;
			}
			System.out.print("please enter the type of food served: ");
			String foodType = kb.nextLine().toLowerCase();
			System.out.println("Please enter food truck rating: ");
			int rating = kb.nextInt();
			kb.nextLine();
			FoodTruck ftruck = new FoodTruck(truckName, foodType, rating);
			System.out.println(ftruck);
			foodtruck[i] = ftruck;
		}

	}

	public void menu() {
		System.out.println("Main Menu");
		System.out.println("----------------------");
		System.out.println("1: foodtruck list ");
		System.out.println("2: Highest Rating ");
		System.out.println("3: Average rating of food trucks");
		System.out.println("4: Quit");
		System.out.println("----------------------");

	}

	public void listTrucks() {
		for (int i = 0; i < foodtruck.length; i++) {
			System.out.println(foodtruck[i]);
		}
	}

	public void highestRating() {
		int highestrating = Integer.MIN_VALUE;
		FoodTruck highestratedfoodtruck = null;
		for (int i = 0; i < foodtruck.length; i++) {
			if (foodtruck[i] == null) {
				break;
			}
			if (foodtruck[i].getRating() >= highestrating) {
				highestrating = foodtruck[i].getRating();
				highestratedfoodtruck = foodtruck[i];
			}

		}
		System.out.println(highestratedfoodtruck);
	}

	public double averageRating(FoodTruck[] foodtruck) {
		double rating = 0;
		int count = 0;
		for (int i = 0; i < foodtruck.length; i++) {

			if (foodtruck[i] != null) {
				count++;
				rating += foodtruck[i].getRating();
			}
			if (foodtruck[i] == null) {
				break;
			}
		}

		rating = rating / count;
		return rating;
	}

	public void goodBye() {
		System.out.println("GoodBye");
	}
}

/*
 * foodtruck [0] = NachoBusiness; foodtruck [1] = IDreamOfWeenie; foodtruck [2]
 * = BaconMeCrazy; foodtruck [3] = CheeseLouise; foodtruck [4] = CrepenAround;
 */