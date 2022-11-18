import java.io.*;
import java.util.*;

public class CapGain{
	//The current total capital gain or loss in dollars
	private double totCapGain;
	//A queue of the purchase of prices of all shares currently held
	public Queue sharesHeld;

	public CapGain(){
		totCapGain = 0; //Initialize as having no gain or loss recorded
		sharesHeld = new Queue(); //New queue to initialize the start of investments
	}

	//Prints out a main menu
	public void mainMenuPrompt(){
		System.out.println("Welcome to the main menu:");
		System.out.println("1. Buy");
		System.out.println("2. Sell");
		System.out.println("3. Total Capital Gain So Far");
		System.out.println("4. Quit");

	}

	//Adds numShares at the price to the queue
	public void buy(int numShares, double price){
		for(int i = 0; i < numShares; i ++){
			sharesHeld.enqueue(price);
		}
	}

	/*remove numShares from the queue and calculates gain or loss
	 * for each share and updates totCapGain */
	public void sell(int numShares, double price){
		if (sharesHeld.Empty()){ //If there are no shares bought so far
			System.out.println("Sorry, you have ZERO shares to sell.");
		}
		else if(numShares > sharesHeld.size()){ //Shares wanting to sell is more than what user acutally has
			System.out.println("Sorry, you dont have enough shares to sell.");
		}

		else{ //Has right amount of shares to sell
			double salePrice = numShares * price;
			double total = 0; 
			for(int i = 0; i < numShares; i++){
				double hold = price - sharesHeld.dequeue();
				salePrice = (numShares * hold);
			}
			totCapGain = totCapGain + salePrice;
		}
		
	}
	public double getTotalCapGain(){
		return totCapGain;
	}
}